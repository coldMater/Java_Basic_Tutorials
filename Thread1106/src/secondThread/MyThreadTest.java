package secondThread;

public class MyThreadTest {

	public static void main(String[] args) {
		
		System.out.println("���� ���α׷� ����"); 	//"���� ���α׷� ����"
		
		MyThread myThread = new MyThread();
		myThread.start(); 					//"MyThread �� ������ �Դϴ�."
		
		System.out.println("���� ���α׷� ����"); 	//"���� ���α׷� ����"

		//���� ������ �ڵ��� ������� ���� �ʴ� ���� Ȯ���� �� �ִ�. 
	}

}
