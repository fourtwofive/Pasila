package org.ssafy.pasila.domain.live.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssafy.pasila.domain.apihandler.ErrorCode;
import org.ssafy.pasila.domain.apihandler.RestApiException;
import org.ssafy.pasila.domain.live.entity.Live;
import org.ssafy.pasila.domain.live.repository.LiveQueryRepository;
import org.ssafy.pasila.domain.live.repository.LiveRepository;
import org.ssafy.pasila.domain.member.dto.ChannelLiveDto;
import org.ssafy.pasila.domain.product.repository.ProductRepository;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalDateTime.*;

@Service
@RequiredArgsConstructor
public class LiveService {

    private final RedisTemplate<String, String> redisTemplate;

    private final LiveRepository liveRepository;

    private final LiveQueryRepository liveQueryRepository;

    private final ProductRepository productRepository;

    public int joinLive(String liveId, String memberId) {

        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        setOperations.add("participant : " + liveId, memberId);
        return setOperations.size("participant : " + liveId).intValue();

    }

    public int exitLive(String liveId, String memberId) {

        SetOperations<String, String> setOperations = redisTemplate.opsForSet();
        setOperations.remove("participant : " + liveId, memberId);
        return setOperations.size("participant : " + liveId).intValue();

    }

    @Transactional
    public void updateLiveOn(String liveId) {
        Live live = getLiveById(liveId);
        live.setLiveOnAt(now());
        live.setOn(true);
    }

    @Transactional
    public void updateLiveOff(String liveId, String fullVideoUrl, int likeCnt) {
        Live live = getLiveById(liveId);
        live.setLiveOffAt(now());
        live.setOn(false);
        live.setFullVideoUrl(fullVideoUrl);
        live.setLikeCnt(likeCnt);
    }

    public Live getLiveById(String id) {
        return liveRepository.findById(id)
                .orElseThrow(() -> new RestApiException(ErrorCode.RESOURCE_NOT_FOUND));
    }

    public String getProductId(String liveId) {
        Live live = liveRepository.findById(liveId).orElseThrow(() -> new RestApiException(ErrorCode.RESOURCE_NOT_FOUND));
        return live.getProduct().getId();
    }

    public List<ChannelLiveDto> getScheduledLiveById(LocalDate date) {
        return liveQueryRepository.findScheduledLiveById(date);
    }
}
