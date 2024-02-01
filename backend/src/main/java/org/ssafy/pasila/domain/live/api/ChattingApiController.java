package org.ssafy.pasila.domain.live.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
import org.ssafy.pasila.domain.live.entity.ChatLog;
import org.ssafy.pasila.domain.live.service.ChattingService;
import org.ssafy.pasila.domain.live.service.LiveService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/live")
@Tag(name = "Chatting", description = "Chatting API")
public class ChattingApiController {

    private final SimpMessagingTemplate template;
    private final ChattingService chattingService;

    @Operation(summary = "Send Chatting", description = "채팅을 구독자에게 보냅니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공")
    })
    @MessageMapping("/chatting")
    public void sendChat(@RequestBody ChatLog chatLog){
        chatLog.addCreatedAt();
        chattingService.saveChat(chatLog);
        template.convertAndSend("/id/" + chatLog.getLiveId(), chatLog);
    }



}
