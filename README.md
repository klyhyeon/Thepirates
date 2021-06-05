## 더파이러츠 백엔드 과제
___

### 1. 설치 환경설정 가이드
- 생략 
___

### 2. SQL 테이블
- JPA @Entity 어노테이션 사용
- Sample for Store Table
```SQL
CREATE TABLE store (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  address VARCHAR(255),
  description VARCHAR(255),
  level INT NOT NULL,
  name VARCHAR(255),
  owner VARCHAR(255),
  phone VARCHAR(255));
```
___
### 3. API 사용 가이드

- 점포 추가

 URL | 설명 | 사용방법
--- | --- | ---
/stores | POST | 새로운 점포를 등록할 수 있다.
/stores/holiday | POST | 점포 휴일을 등록할 수 있다.
/stores | GET | 모든 점포리스트를 볼 수 있다.
/stores/{id} | GET | 해당 {id} 점포 상세조회가 가능하다.


