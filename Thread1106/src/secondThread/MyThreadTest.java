package secondThread;

public class MyThreadTest {

	public static void main(String[] args) {
		
		System.out.println("메인 프로그램 실행"); 	//"메인 프로그램 실행"
		
		MyThread myThread = new MyThread();
		myThread.start(); 					//"MyThread 의 스레드 입니다."
		
		System.out.println("메인 프로그램 종료"); 	//"메인 프로그램 종료"

		//실행 순서가 코드의 순서대로 되지 않는 것을 확인할 수 있다. 
	}

}
