# 🎉 로또 맞추기 게임 🎉
## 📣 기능 목록 
### 1️⃣ 입력
* 로또 구매 금액 입력받기
* 당첨 번호 입력받기
* 보너스 번호 입력받기

### 2️⃣ 출력
* 발행한 로또 수량 및 번호 출력하기
* 당첨 내역 출력하기
* 총 수익률 출력하기
* 예외 상황 시 Error <code>[Error] 로또 번호는 1부터 45 사이의 숫자여야 합니다.</code>
문구 출력

### 3️⃣ 기타
* 로또 번호 생성하기 (1~45 난수)
* 수익률 계산하기
* 당첨 번호 비교하기
* 구매 금액에 따른 로또 갯수 계산하기


## 📣 클래스 목록
### 1️⃣ Model
#### Lotto.java
* Lotto 객체
* 생성자를 통해 객체를 생성할 때 마다 랜덤 난수가 설정되게 작성
#### LottoRepository.java
* 객체를 직접 가져오는 것이 아니라 Repository를 통해 원하는 데이터만 가져오도록 제어 

### 2️⃣ Controller
#### LottoController.java
* 로또 게임의 전반적인 흐름을 담당
* 여러가지 Service 클래스 내 메서드를 호출

### 3️⃣ View
#### InputView.java
* 금액 및 번호를 입력 받는 View
#### OutputView.java
* 발행한 로또 수량 및 번호, 당첨 내역, 총 수익률을 출력하는 View

### 4️⃣ Message
#### InputMsg.java
* Enum 클래스를 통해 사용자 입력 메소드 호출 시 문구를 출력
#### OutputMsg.java
* Enum 클래스를 통해 결과 출력 메소드 호출 시 문구를 출력

### 5️⃣ Service
#### Service.java
* Service 인터페이스를 통해 ServiceImpl에서 구현할 메소드를 명시
#### ServiceImpl.java
* 실제 Service를 진행할 메소드를 구현