# 🗓️ Spring_day_Project
***
☀️ Spring Day - CH 3 일정 관리 앱 Develop
## 📔 목차 
***
- 🔍 Project 소개
- 🚀 주요 기능
- 🪛 개발 환경
- 🧾 API 명세서
- 📝 ERD
***



## 🔍 Project 소개

## 🚀 주요 기능




## 🪛 개발 환경
-  ☕️ Languages  : `Java`
-  ✏️ JDK : `Oracle OpenJDK 17.0.5`
- ⚙️ framework : `Spring Boot 3.4.5`, `Spring Data JPA`
- 🗄️ DB : `MySQL`
- 🛠️ IDE : `IntelliJ IDEA`


## 🧾 API 명세서
| 기능    | HTTP 메서드 | URL         | 설명          |
|-------|-------------|-------------|-------------|
| 일정 등록 | POST        | /todos      | 일정 등록       |
| 전체 조회 | GET         | /todos      | 전체 일정 목록 조회 |
| 단건 조회 | GET         | /todos/{id} | 단건 일정 조회    |
| 일정 수정 | PUT         | /todos/{id} | 특정 일정 수정    |
| 일정 삭제 | DELETE      | /todos/{id} | 특정 일정 삭제    |

<details>
  <summary>일정 등록</summary>

  ## 개요

- **URL**: `/todos`
- **Method**: `POST`
- **설명**: 일정을 생성하는 API입니다.

### 요청 (Request)

- Params: 없음
- Body (JSON):

```json
{
  "title": "팀 프로젝트 준비",
  "content": "팀 프로젝트 회의 자료 준비 및 발표 연습",
  "username": "홍길동"
}
```

### 성공 응답 (Response)

- Status: `201 Created`

```json
{
  "id": 1,
  "title": "팀 프로젝트 준비",
  "content": "팀 프로젝트 회의 자료 준비 및 발표 연습",
  "username": "홍길동",
  "createdAt": "yyyy-mm-dd",
  "modifiedAt": "yyyy-mm-dd"
}
```

### 실패 응답

- Status: `400 Bad Request` 

```json
{
  "error": "title은 필수 항목입니다."
}
```
</details>
<details>
  <summary>전체 조회</summary>

## 개요

- **URL**: `/todos`
- **Method**: `GET`
- **설명**: 모든 일정을 조회하는 API입니다.

### 요청 (Request)

- Params: 없음
- Body: 없음

### 성공 응답 (Response)

- Status: `200 OK`

```json
[
  {
    "id": 1,
    "title": "팀 프로젝트 준비",
    "content": "팀 프로젝트 회의 자료 준비 및 발표 연습",
    "username": "홍길동",
    "createdAt": "yyyy-mm-dd",
    "modifiedAt": "yyyy-mm-dd"
  },
  {
    "id": 2,
    "title": "개인프로젝트 준비",
    "content": "개인 프로젝트 회의 자료 준비 및 발표 연습",
    "username": "심청이",
    "createdAt": "yyyy-mm-dd",
    "modifiedAt": "yyyy-mm-dd"
  }
]
```
</details>
<details>
  <summary>단건 조회</summary>
  
## 개요

- **URL**: `/todos/{id}`
- **Method**: `GET`
- **설명**: 단건 일정을 조회하는 API입니다.

### 요청 (Request)

- Params: `id` (Path Variable)
- Body: 없음

### 성공 응답 (Response)

- Status: `200 OK`

```json
{
  "id": 1,
  "title": "팀 프로젝트 준비",
  "content": "팀 프로젝트 회의 자료 준비 및 발표 연습",
  "username": "홍길동",
  "createdAt": "yyyy-mm-dd",
  "modifiedAt": "yyyy-mm-dd"
}
```

### 실패 응답

- Status: `404 Not Found`

```json
{
  "error": "해당 일정이 존재하지 않습니다."
}
```
</details>
<details>
  <summary>일정 수정</summary>
  
## 개요

- **URL**: `/todos/{id}`
- **Method**: `PUT`
- **설명**: 특정 일정을 수정하는 API입니다.

### 요청 (Request)

- Params: `id` (Path Variable)
- Body (JSON):

```json
{
  "title": "팀 프로젝트 준비 - 계획 변경",
  "content": "팀 프로젝트 회의 자료 발표 시작으로 변경"
}
```

### 성공 응답 (Response)

- Status: `200 OK`

```json
{
  "id": 1,
  "title": "팀 프로젝트 준비 - 계획 변경",
  "content": "팀 프로젝트 회의 자료 발표 시작으로 변경",
  "username": "홍길동",
  "createdAt": "yyyy-mm-dd",
  "modifiedAt": "yyyy-mm-dd"
}
```

### 실패 응답

- Status: `404 Not Found`

```json
{
  "error": "수정하려는 일정이 존재하지 않습니다."
}
```
</details>
<details>
  <summary>일정 삭제</summary>
  
## 개요

- **URL**: `/todos/{id}`
- **Method**: `DELETE`
- **설명**: 특정 일정을 삭제하는 API입니다.

### 요청 (Request)

- Params: `id` (Path Variable)
- Body: 없음

### 성공 응답 (Response)

- Status: `200 OK`

```json
{
  "message": "삭제 완료"
}
```

### 실패 응답

- Status: `404 Not Found`

```json
{
  "error": "삭제하려는 일정이 존재하지 않습니다."
}
```
</details>



## 📝 ERD