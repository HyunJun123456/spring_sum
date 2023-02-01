
//이클립스 = Ctrl+F11
//KeyMap = 인텔리J = shift+f10
public class HelloWorld {
	//스프링부트 연습을 위한 첫번째 테스트!!
	public static void main(String[] args) {
		System.out.println("헬로우 월드");
		System.out.println("헬로우 월드");
		System.out.println("헬로우 월드");
		System.out.println("헬로우 월드");
	}
	/*
	 * UTF-8이란
	 * 박스가 8개면 256개의 경우의 수가 표현이 가능함
	 * 경우의 수를 가지고 약속을 할 수 있음
	 * 8 bit => 1 Byte
	 * 
	 * */
	
	/*
	 * 깃을 통해 프로젝트 관리가 가능함
	 *      흐르는 뷰				  사진				 사진첩
	 * 작업 영역(폴더) -> 인덱스(Index) -> 헤드(HEAD)
	 * 						 (add)					(commit)
	 * 일치 = 동기화
	 * 
	 * 
	 * */
	
	/*
	 * http 통신 4가지 방법 (요청의 방법)
	 * Get : 데이터를 줘! (select)
	 * Post : 데이터를 추가해줘! (insert)
	 * Put : 데이터를 수정해줘! (update)
	 * Delete : 데이터를 삭제해줘! (delete)
	 * How가 없다 -> '?'를 통해 어떤 데이터인지 명시
	 * 
	 */
	
	/*
	 * stateful -> 연결이 지속된 형태
	 * stateless -> 응답 후 연결을 끊어버림
	 * 
	 * */
	
	/*
	 * http 통신
	 * 패킷 스위칭(교환) 방식 - 패킷 단위로 잘라서 보냄 -> 쿠콘이 왜 하나의 선으로 되어 있는지 알 수 있음
	 * 
	 * 서킷 스위칭 - 한방에 보냄 -> API 통신 할 때 여러선이 필요한 이유
	 * 
	 * */
	
	/*
	 * JSON (왜?) -> 어떻게 사용?
	 * 공용어의 개념!!
	 * 통신: 자바오브젝트 -> JSON
	 * 							전송
	 * @Controller에서 RequestBody는 MIME type이 JSON으로 받을꺼임.
	 * response 해줘야한다면 Java -> JSON으로 변경해서 보내줄꺼임.
	 * */
	
	/*
	 * Get 요청 (select 할때)
	 * 특징: body로 데이터를 담아 보내지 않음.
	 * 
	 * Post, Put, Delete 요청 (데이터를 변경)
	 * 특징: 데이터를 담아보내야 할 것이 많음.
	 * form 태그 method = 'POST'
	 * form 태그 -> get요청, post요청 (key = value 형태)
	 * 자바스크립트로 요청을 해야함(put, delete).
	 * 통일: 자바스크립트로 ajax 요청 + 데이터는 json으로 통일!!
	 * form:form 태그 -> post요청, put요청, delete요청, get요청 다 가능 (사용은 하지 않을꺼임)
	 * 
	 * */
	
	/*
	 * key = value 데이터를 자동으로 파싱하여 변수에 담아줌.
	 * key = value 데이터를 오브젝트로 파싱해서 받아주는 역할도 함. - setter가 있어야 파싱이 가능.
	 * key = value가 아니면 @RequestBody를 붙여줘야함.
	 * */
	
	/*
	 * 회원가입시 Ajax를 사용하는 2가지 이유
	 * 1. 요청에 대한 응답을 html이 아닌 Data(Json)를 받기 위해서
	 * 브라우저 -> 서버 -> DB -> 서버 -> 브라우저
	 * 서버에서 브라우저에게 data(정상)을 보내주고 브라우저에서 다시 서버에 request를 통해 
	 * 메인페이지를 보여주는 방식을 채택함.
	 * 2. 비동기 통신을 하기 위해서
	 * 하던 일을 멈추고 다시 돌아가는 현상 -> 콜백
	 * 동기는 순차적으로 진행 비동기는 순차적으로 진행하지 않아도 됨
	 * 동기에서는 순차적으로 진행되지 않으면 다음으로 넘어갈 수 없음.
	 * */
	
	/*
	 * 트랜잭션: 일이 처리되기 위한 가장 작은 단위
	 * DB 격리수준
	 * 오라클: 커밋된 것만 READ함
	 * 
	 * PHANTOM READ -> 정합성이 깨짐
	 * 
	 * */
	
	/*
	 * 스프링 시작
	 * 1. 톰캣 시작 - 서버 작동!
	 * 2. web.xml
	 * 3. context.xml -> DB 연결 테스트
	 * 
	 * */
	
	/*
	 * 1. JDBC 커넥션
	 * 2. 트랜잭션 시작
	 * 3. 영속성 컨텍스트 시작 (사용자마다 생성)
	 * controller -> service -> repository
	 * 4. JDBC 커넥션 종료
	 * 5. 트랜잭션 종료 - commit - 변경감지 (update 수행)
	 * 6. 영속성 컨텍스트 종료
	 * */
	 
	/*
	 * 시큐리티 -> 로그인 요청
	 * 시큐리티가 지켜보다가 username과 password를 가로챔.
	 * 시큐리티가 로그인을 진행시킴
	 * 시큐리티 세션에 내 유저 정보가 저장되어 있음
	 * DI로 유저 정보를 가져다가 쓸 수 있음.
	 * 해쉬 -> 고정 길이의 문자열로 변경
	 * */
	
	/*
	 * csrf, xss
	 * xss -> 자바스크립트 공격
	 * http://naver.com/admin/point?id=xxx&point=xxx
	 * -> xxx에 임의로 값을 넣어서
	 * 시큐리티: /admin/** -> 권한이 ADMIN인 사람만 들어갈 수 있게 막아야함.
	 * 1. 막기 위해서 post 방식을 사용해야함. (get 방식 x)
	 * 2. Referrer 검증 -> 같은 도메인 상에서 요청이 들어오지 않는다면 차단
	 * 3. CSRF 토큰 사용
	 * */
	
	/*
	 * OAuth -> Open Auth : 인증을 대신 해줌
	 * 인증하기 완료 - code 지급
	 * 권한 부여 - AccessToken
	 *
	 * 리소스 오너 - 클라이언트 - 인증 서버 - 리소스 서버
	 * */
	
	
}
