
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
		
		/*
		 * 스프링부트 동작원리
		 * 1. 내장 톰캣을 가진다.
		 * Socket 
		 * ip 주소와 포트번호를 넣게 되면 연결
		 * 포트번호에 연결이 됨
		 * A와 B는 메세지를 전달 받을 수 있음
		 * C는 5000번 포트로 연결 할 수 없음
		 * A랑 연결하는 건 5000번 포트로 남겨두고
		 * 연결이 끊긴후 5001번을 통해 A와 B를 연결함
		 * 5001 포트를 만들때 스레드를 만들어줘서 5000 포트 메인 스레드를 사용할 수 있게 함
		 * C는 5000 포트와 연결하고 5002 포트에 연결됨 스레드2가 사용
		 * 소켓통신의 장점: 연결이 계속 되어 있음
		 * 생각보다 부화가 되게 크다
		 * http 통신 - stateless 방식
		 * 문서를 전달하는 통신!
		 * 연결이 성공하고 응답해준 후 연결을 끊어버림
		 * */
		
		/*
		 * 톰캣이란?
		 * http 기반은 소켓이다.
		 * 톰캣과 웹서버에 대한 차이
		 * request(요청): ip 주소를 알아야함, url(자원을 요청하는 주소) Location
		 * 해당 데이터를 response(응답) 해줌
		 * 그 정보에 response 해주면 됨 (response는 url을 몰라도 됨)
		 * 갑은 을의 ip 주소를 모른다.
		 * 요청에 대한 응답만 하면 되서
		 * 요청을 하지 않으면 응답을 할 수 없음
		 * 을의 주소를 알려면 소켓을 써야함
		 * 소켓 통신은 연결이 지속됨
		 * http는 단순히 요청에 대한 응답을 해주는 구조
		 * 웹서버는 정적인 자원을 응답해줌
		 * 웹서버: 아파치
		 * .jsp 파일(자바코드가 적혀져 있는거) 아파치는 이해하지 못함
		 * 그래서 톰캣을 추가해줘야함
		 * 아파치가 이해하지 못하는걸 톰캣한테 해석해달라고 요청함
		 * 톰캣은 .jsp -> 자바 -> 컴파일
		 * 컴파일이 끝나면 .html에 덮어 씌운다.
		 * 다시 아파치한테 돌려준다.
		 * 아파치가 해당 파일에 대한 응답을 진행한다.
		 *  웹브라우저는 html, js, css, avi 정적인 애들만 이해 가능
		 *  
		 * */
		
		/*
		 * 서블릿 컨테이너
		 * client -> 서블릿 컨테이너 -> 최초 요청 -> 메모리 로딩 -> 객체 생성 -> init()
		 * 최초 요청이 아니면 init()을 재사용
		 * URL: 자원 접근 : http://naver.com/a.png
		 * URI: 식별자 접근: http://naver.com/picture/a -> 톰캣이 가로챔
		 * 특정한 파일 요청을 할 수 없다. 요청시에는 무조건 자바를 거친다.
		 * [강의에서 오류가 있는데, 서블릿 객체는 하나이구요. 
		 * 그 하나의 객체를 스레드가 만들어지면서 공유해서 사용합니다. 
		 * 어차피 메서드를 호출하는 것이기 때문에 객체가 하나여도 메서드의 스택은 스레드마다 생기기 때문입니다.]
		 * 동시 접근을 허용하기 위해서 스레드를 만든다.
		 * 스레드를 많이 만들면 대기는 안하지만 3초 걸릴게 6초로 딜레이 됨
		 * 스레드를 재사용해서 빠르다.
		 * */
		
		/*
		 * web.xml은 무엇인가요?
		 * ServletContext의 초기 파라미터
		 * Session의 유효시간 설정
		 * Servlet/JSP에 대한 정의
		 * Servlet/JSP 매핑
		 * Mime Type 매핑
		 * Welcome File List
		 * Error Pages 처리
		 * 리스너/필터 설정
		 * 보안
		 * 
		 * web.xml은 문지기의 역할을 해줌.
		 * get 방식: select
		 * */
		
		/*
		 * .do(특정주소)
		 * 요청이 URI, 혹은 자바파일
		 * 톰캣으로 감
		 * request, response 객체를 만듦
		 * 객체로 만들면 request.함수를 사용할 수 있음
		 * web.xml -> FrontController 
		 * .do는 frontController 너가 낚아채
		 * 자원을 찾아갈 수 있게 request를 함
		 * 기존에 있는 request와 response를 유지하는 방법 -> requestDispatcher
		 * 새로운 요청이 생기기 때문에 request와 response가 새롭게 new 될 수 있음.
		 * requestDispatcher를 통해 request와 response를 그대로 사용할 수 있음.
		 * DispatchServlet
		 * : FrontController 패턴을 직접 짜거나 RequestDispatcher를 직접 구현할 필요가 없다.
		 * 왜냐하면 스프링에는 DispatchServlet이 있기 때문이다. 
		 * DispatchServlet은 FrontController 패턴 + RequestDispatcher이다.
		 * 
		 * */
		
		/*
		 * ApplicationContext가 무엇인가요?
		 * request -> web.xml -> DispatchServlet (컴포넌트 스캔, src 내부에 있는 모든 파일 new 해줌) 주소 분배
		 * static -> 메인 메소드가 실행 되기 전부터 떠있음
		 * 자바파일 -> 객체! (생성과 사라짐이 존재) 특정한 타이밍에 메모리에 뜬다
		 * 어노테이션들을 메모리에 띄운다.
		 * web.xml에 다음에 ContextLoaderListener가 있음
		 * 요청한 사람에 따라서 스레드를 20개 만든다고 약속하면
		 * 각각의 스레드는 독립적임
		 * 요청은 1개지만 스레드는 여러개가 가능
		 * root-applicationContext 파일을 읽는데 xml로 커스텀 할 수 있음
		 * ContextLoaderListener가 공통적으로 쓰는 애들의 메모리를 띄워줌
		 * ApplicationContext의 종류에는 두가지가 있다.
		 * root-applicationContext
		 * - Service, Repository 등을 스캔
		 * - DB 관련 객체를 생성 (스캔이란: 메모리에 로딩)
		 * - ContextLoaderListener에 의해 실행
		 * - ContextLoaderListener를 실행해주는 녀석은 web.xml이기 때문에
		 * root-applicationContext에서는 servlet-applicationContext보다 먼저 로드
		 * servlet에서는 root가 로드한 객체를 참조할 수 있지만 그 반대는 불가능
		 * 
		 * servlet-applicationContext
		 * - ViewResolver, Interceptor, MultipartResolver 객체를 생성
		 * - Controller, RestController 스캔
		 * - 해당 파일은 DispatchServlet에 의해 실행
		 * - 웹만 바라봄
		 * 
		 * @Bean을 통해 메모리에 띄울 수 있음
		 * 필요할 때 getBean이라는 메소드를 통하여 호출하여 메모리에 로드함
		 * 필요할 때 호출하여 lazy-loading이 가능함
		 * 
		 * */
		
		/*
		 * 응답(Response) 하는 방법
		 * 요청 주소에 따른 적절한 컨트롤로 요청 (Handler Mapping)
		 * html파일을 응답할지 Data를 응답할지 결정해야 하는데 html 파일을 응답하게 되면
		 * ViewResolver가 관여하게 됨
		 * Data를 응답하게 되면 MessageConverter가 작동하게 되는데
		 * 메시지를 컨버팅할 때 기본전략은 json임
		 * 
		 * */
		
		
	}
}
