<img src="https://capsule-render.vercel.app/api?type=waving&color=auto&height=200&section=header&text=J4JG&fontSize=80&fontColor=ffffff" align="center"/>

## 프로젝트 소개
프로젝트 잡포자기는 취업 준비생들을 위한 채용 정보 제공 및 멘토링 서비스를 제공하는 웹사이트입니다.  
최신 채용 정보를 확인하고 맘에 드는 공고를 스크랩하며, 맞춤형 멘토링 프로그램을 통해 취업 준비에 필요한 조언을 받을 수 있습니다.

## 팀원 소개
| 최승욱 | 배성민 | 정찬용 | 박경덕 |
|--------|--------|--------|--------|
|[<img src="https://img.shields.io/badge/Github-Link-ffffff?logo=Github">](https://github.com/miniato2) | [<img src="https://img.shields.io/badge/Github-Link-ffffff?logo=Github">](https://github.com/mini-xi) | [<img src="https://img.shields.io/badge/Github-Link-ffffff?logo=Github">](https://github.com/jcy168942) | [<img src="https://img.shields.io/badge/Github-Link-ffffff?logo=Github">](https://github.com/virtue14) | 
<br>  

## 개발환경
- Java 17
- SpringBoot 3.3.2
- OAuth2.0
- MySql 8.0
- ElasticSearch 8.13.4
- LogStash 8.13.4
- Redis

## ERD
<img width="1016" alt="ERD" src="https://github.com/user-attachments/assets/b6bdfea6-4b52-4c92-b62f-bae387532a33">

## API 명세
<details>
  <img src="https://github.com/user-attachments/assets/7e0c1db6-c9f4-4b48-8364-43806b6f0fca" width="24%" align="top">
  <img src="https://github.com/user-attachments/assets/64051a7e-8b36-4897-b009-c5cb480a9ce4" width="24%" align="top">
  <img src="https://github.com/user-attachments/assets/8db47e89-26c6-4e16-8bff-b42868b02895" width="24%" align="top">
  <img src="https://github.com/user-attachments/assets/b9c295a5-55fb-4eff-a34f-00114c7d9f85" width="24%" align="top">
  
</details>

## 담당 파트

- 채용정보 크롤링
  - 원티드 사이트의 API를 활용해 실시간으로 채용공고 데이터를 수집하고 Logstash 파이프라인을 통해 ElasticSearch에 저장
  - Logback을 사용해 수집된 채용공고 데이터를 로그 파일로 기록 
  - Logback의 롤링 정책을 활용하여 일정 주기마다 로그 파일을 관리

- 멘토링 서비스
  - 멘토가 멘토링 세션을 생성하고 관리자가 멘티와 매칭
  - 매칭된 데이터를 저장하고 관리하는 기능을 구현

- 알림 서비스
  - 멘토링 매칭 시 알림을 보내기 위한 로직 구현
  - 매칭이 완료되면 먼저 알림 엔티티를 DB에 저장 (알림 발송 시점을 조절하여 성능을 최적화하고 잠재적인 오류를 방지)
  - 스프링 스케줄러를 사용하여 일정 시간마다 DB에서 아직 전송되지 않은 알림을 확인하고 발송

- 스크랩
  - 사용자가 원하는 채용공고를 스크랩할 수 있는 기능 구현
  - 사용자가 채용공고를 스크랩하면 포인트가 추가되는 로직과 연동


