package firstThread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		String name = Thread.currentThread().getName();
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + name);
		//스레드를 만들어주지 않았는데도 불구하고 main 이라는 이름의 스레드가 실행되고 있음을 알 수 있다. 
		//메인 메소드는 기본적으로 main 스레드를 갖고 있다. 
		
		
	}

}
