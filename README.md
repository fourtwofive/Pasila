# 🥇 PASILA (팔기 쉬운 라이브)


### 1. 개요

## Problem

점점 많아지는 라이브 커머스 인기, 그러나 1인 쇼핑몰이 시작하기에 너무 많은 시간이 소모된다.

## User Research

Insight1: 라이브 준비 시간이 너무 오래 걸려😥 ⇒ AI 큐시트 생성

Insight2: 요즘 숏폼이 유행이라던데 영상 편집을 해본적이 없어😫 ⇒ 숏폼 생성

Insight3: 말하면서 채팅까지..어떻게 확인하지? 😑 ⇒ 실시간 채팅 요약 리스트 업

## Solution

AI를 활용한 라이브 커머스 준비, 진행으로

1인 쇼핑몰의 시간 부족을 지원해줄 수 있는 라이브 커머스 플랫폼

---

### 2. 개발 환경

⚙ Management Tool  
<img alt ="Jira" src = "https://img.shields.io/badge/jira-0055CC.svg?logo=Jira"> <img alt ="GitLab" src = "https://img.shields.io/badge/gitlab-FC6D26.svg?logo=GitLab"> <img alt ="Gerrit" src = "https://img.shields.io/badge/gerrit-EEEEEE.svg?logo=Gerrit&logoColor=black"> <img alt ="Notion" src = "https://img.shields.io/badge/notion-000000.svg?logo=Notion"> <img alt ="Figma" src = "https://img.shields.io/badge/figma-F24E1E.svg?logo=Figma&logoColor=white"> <img src="https://img.shields.io/badge/MATTERMOST-0058CC?style=flat-square&logo=mattermost&logoColor=white">

🖥️ IDE  
<img src="https://img.shields.io/badge/vscode-007ACC?style=flat-square&logo=visualstudiocode&logoColor=white">
<img src="https://img.shields.io/badge/IntellJ IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white">

🌐 Infra  
<img src="https://img.shields.io/badge/AWS EC2-FF9900?style=flat-square&logo=amazonec2&logoColor=white">
<img src="https://img.shields.io/badge/NGINX-009639?style=flat-square&logo=nginx&logoColor=white">
<img src="https://img.shields.io/badge/DOCKER-2496ED?style=flat-square&logo=docker&logoColor=white">
<img src="https://img.shields.io/badge/UBUNTU-E95420?style=flat-square&logo=ubuntu&logoColor=white">
<img src="https://img.shields.io/badge/JENKINS-D24939?style=flat-square&logo=jenkins&logoColor=white">

🌄 Frontend  
<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/vue.js-4FC08D?style=flat-square&logo=vue.js&logoColor=white">
<img src="https://img.shields.io/badge/sass-CC6699?style=flat-square&logo=sass&logoColor=white">
<img src="https://img.shields.io/badge/JAVASCRIPT-F7DF1E?style=flat-square&logo=javascript&logoColor=white">
<img src="https://img.shields.io/badge/axios-5A29E4?style=flat-square&logo=axios&logoColor=white">
<img src="https://img.shields.io/badge/vite-646CFF?style=flat-square&logo=vite&logoColor=white">

🌆 Backend  
<img src="https://img.shields.io/badge/JAVA-FF4000?style=flat-square&logo=openjdk&logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=flat-square&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/springsecurity-6DB33F?style=flat-square&logo=springsecurity&logoColor=white">
<img src="https://img.shields.io/badge/HIBERNATE-59666C?style=flat-square&logo=hibernate&logoColor=white">
<img src="https://img.shields.io/badge/MYSQL-4479A1?style=flat-square&logo=mysql&logoColor=white">
<img src="https://img.shields.io/badge/REDIS-DC382D?style=flat-square&logo=redis&logoColor=white">
<img src="https://img.shields.io/badge/swagger-85EA2D?style=flat-square&logo=swagger&logoColor=white">

---

### 3. 기술 소개

1.  OpenAI API

    자연어 처리를 비롯한 다양한 ai 기술들을 활용하여 다양한 기능을 제공하는 API

    https://platform.openai.com/

    - GPT-3.5-Turbo 모델을 사용한 Chat Completions
    - Whisper 모델을 사용한 Speech-to-text

2.  OpenVidu

    웹 또는 모바일 환경에서 화상 회의 기능을 쉽게 추가할 수 있도록 해주는 오픈소스 멀티 플랫폼

    version: 2.29.0

3.  FFmpeg.wasm

    영상 및 음성과 같은 멀티미디어의 인코딩/디코딩을 제공하는 오픈소스 라이브러리

    영상 편집 및 음성 추출에 사용하였습니다.


