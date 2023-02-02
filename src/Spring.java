
public class Spring {
	public static void main(String[] args) {
		
		/*
		 * 스프링이란?
		 * 1. Framework (틀안에서 동작)
		 * 2. 오픈 소스 (무료) - 소스 코드 공개! 내부를 볼 수 있음 -> 뜯어고칠 수 있음.
		 * 3. IoC(Inversion of Controller / 제어의 역전) 컨테이너를 가진다. -> 주도권이 스프링에 있음.
		 * class -> 설계도!		abstract class (추상적)
		 * object -> 실체화가 가능한 것!
		 * instance -> 실체화 된 것!
		 * ex) 가구는 실체화 불가능 -> 추상적이다.
		 * 실체화가 가능한 것은 의자, 침대 -> object라고 함.
		 * 이 세상에 튀어나오는 순간 실체화가 되어 instance가 됨.
		 * 직접 스프링이 스캔해서 object를 heap 메모리에 올려준다 -> IoC (스프링이 관리함)
		 * 4. 스프링은 DI (Dependency Injection / 의존성 주입)를 지원한다.
		 * IoC와 DI를 통해 프로그램 짜는게 굉장히 편해진다.
		 * 5. 스프링은 엄청나게 많은 필터를 가지고 있다.
		 * 필터: 문지기라고 생각하면 됨 (스프링 자체 필터도 존재)
		 * 톰캣이라는 큰 문지기 / 스프링 컨테이너 (안에 있는 문지기) 사실상 톰캣안에 스프링 컨테이너가 있는건 아님
		 * 스프링 컨테이너에 들어오게 하는 필터 => 인터셉터(AOP)
		 * 6. 스프링은 엄청나게 많은 어노테이션을 가지고 있다. (리플렉션, 컴파일체킹)
		 * 컴파일체킹
		 * 어노테이션: 주석인데 컴파일러에게 힌트를 주는 거라서 무시하지 않음. (기본적으로 주석은 컴파일러가 무시함)
		 * 스프링 -> 어노테이션 객체 생성
		 * @Component -> 클래스 메모리에 로딩해
		 * @Autowired -> 로딩된 객체 해당 변수에 집어 넣어
		 * 분석 (리플렉션) : 메서드, 필드, 어노테이션 체킹 -> 무엇을 하는지도 명시해줌
		 * 리플렉션 (분석하는 기법 -> 런타임시 분석)
		 * 7. 스프링은 MessageConverter를 가지고 있다. 기본값은 현재 json이다.
		 * 자바 object -> 파이썬 프로그램
		 * request 요청시 데이터를 json으로 바꿈
		 * change 해주는 친구: MessageConverter -> Jackson이 설정됨
		 * 마찬가지로 응답을 받을 때도 json 데이터가 오게되는데 자바 오브젝트로 바꿔줌
		 * 8. 스프링은 BufferedReader와 BufferedWriter를 쉽게 사용할 수 있다.
		 * Byte Stream: 1 Byte : 8 bit
		 * InputStream(문자: char) -> InputStreamReader(배열: 여러개의 문자) -> BufferedReader(가변길이의 문자열)
		 * @ResponseBody -> BufferedWriter를 사용하게 됨
		 * @RequestBody -> BufferedReader가 동작하게 됨
		 * */
		
		
		/*
		 * JPA란 무엇인가요?
		 * RAM (전기로 데이터가 흐름) 휘발성
		 * 컴퓨터가 꺼지면 사라짐
		 * persistence: 하드디스크에 저장하는거: 하나의 데이터가 영구히 기록될 수 있게함
		 * 자바에 있는 데이터를 영구히 저장할 수 있게 만들어주는 API
		 * API: Application Programming Interface
		 * 상하관계가 존재하는 약속
		 * 프로토콜은 상하관계가 존재하지 않음
		 * 1. Java Persistence API 이다.
		 * 2. JPA는 ORM 기술이다.
		 * ORM (Object Relational Mapping)
		 * 자바는 데이터베이스에 있는 타입을 가지지 않는다, -> 모델링 해야함
		 * DB 세상에 있는 데이터를 자바 세상에 모델링!!
		 * TRM이 아니라 ORM 상황이 역전되는 거임
		 * Class를 먼저 만들고 class를 통해 자동으로 DB를 만든다.
		 * JPA의 인터페이스 규칙을 지키면 가능함
		 * 3. JPA는 영속성 컨텍스트를 가지고 있다.
		 * 영속성: 데이터 -> 영구적으로 저장!
		 * 자바는 데이터베이스에 저장 ex) mysql
		 * 컨텍스트: context: 대상에 대한 모든 정보
		 * 4. JPA는 DB와 OOP의 불일치성을 해결하기 위한 방법론을 제공한다. (DB는 객체저장 불가능)
		 * 5. JPA는 OOP의 관점에서 모델링을 할 수 있게 해준다. (상속, 콤포지션, 연관관계)
		 * 6. 방언 처리가 용이하여 Migration하기 좋음. 유지보수에도 좋음.
		 * */
		
		
		
		
	}
}
