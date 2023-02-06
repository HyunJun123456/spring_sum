
public class OS { // Operating System
	public static void main(String[] args) {
		/*
		 * operating system
		 * 스마트폰을 컴퓨터라고도 부름
		 * 계산기는 calculator라고 부름
		 * 컴퓨터의 정의는 information : 정보를 처리하는 기계
		 * binary digit -> bit (정보의 최소 단위)
		 * 불확실성을 측정해서 양으로 만드는 것
		 * 정보의 상태 변환을 위한 물리적인 장치 (0에서 1로, 1에서 0으로)
		 * 범용성
		 * - NOT, AND, OR 게이트만으로 모든 계산을 할 수 있다.
		 * 컴퓨터가 모든 것을 다 계산 할 수 있는 것은 아님
		 * 컴퓨터의 할아버지 : Alan Turing
		 * 내장형 프로그램 도입 : 폰 노이만
		 * 메모리에 프로그램을 저장하는 방식
		 * fetch -execute 방식
		 * 프로그램 : H/W에 task를 수행할 수 있는 명령어들의 집합
		 * 우리가 코드를 짜면 compile 해서 기계어로 만들어줌
		 * 운영체제도 프로그램인가요?
		 * 컴퓨터에서 항상 실행중인 프로그램
		 * H/W에 직접 컨택하기 힘드니 O/S가 담당함
		 * 프로세스, 자원, user interface를 관리함
		 * 운영체제가 뭔가요?
		 * 컴퓨터 시스템을 운영하는 소프트웨어
		 * 하드웨어 device를 조절할 수 있는
		 * APP과 user와 컨택해서 하드웨어와 연결
		 * 아두이노, 라즈베리는 하드웨어에서 직접 다루는거임
		 * 하드웨어가 복잡해지니 운영체제가 관리하기 시작함
		 * */
		
		/*
		 * 운영체제의 개념과 구조
		 * 컴퓨터 시스템
		 * 하드웨어 / 운영체제 / 시스템, application programs / user
		 * 응용 프로그램을 운영체제가 연결해줌
		 * O/S의 핵심 부분 kernel
		 * CPU / disk controllers / USB controller / graphics adapter
		 * memory
		 * 컴퓨터를 키는걸 부팅한다고 하는데 
		 * bootstrap (전원을 on)
		 * - 컴퓨터가 처음 시작될 때 
		 * 메모리에 o/s를 로딩 시킴
		 * interrupt를 통해 cpu하고 주변장치와 통신
		 * cpu에 시그널을 보내줌
		 * 용량과 속도에 따라 계층에 나뉨
		 * register / cache / main memory(RAM) / solid-state disk(SSD) / hard disk(HDD) / optical disk / magnetic tapes(백업 용도)
		 * CPU, Processor, Core, Multicore, Multiprocessor
		 * 여러개의 core를 붙이기 시작
		 * Multiprogramming: 여러개의 프로그램을 한번에 올려둠
		 * 프로그램을 메모리에 올려둠
		 * 동시 다발적으로 올라가면 CPU 가용 효율을 높일 수 있음
		 * time-sharing 시분할을 통해 여러개의 job을 빈번히 사용할 수 있음
		 * CPU scheduling
		 * 어떤 시스템을 실행시키는게 가장 효율적으로 cpu를 사용할 수 있는지
		 * kernel mode가 아니면 직접적으로 하드웨어를 제어 할 수 없게 만들어
		 * 나쁜짓을 하지 못하게 막아둠
		 * 하나의 하드웨어에 VMM을 통해 여러개의 O/S를 올릴 수 있음
		 * Client-Server Computing
		 * Peer-to-Peer Computing
		 * Cloud Computing (AWS, Azure, GCP)
		 * system calls : OS와 interface하는 방법
		 * shells: sh, bash, csh, etc
		 * GUI: 마우스로 클릭하는해서 interface함
		 * 
		 * */
		
		
		
	}
}
