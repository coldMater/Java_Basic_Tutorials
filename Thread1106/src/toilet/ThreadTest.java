package toilet;

public class ThreadTest {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread �ƺ� = new FamilyThread(wr,"�ƺ�");
		FamilyThread ���� = new FamilyThread(wr,"����");
		FamilyThread �� = new FamilyThread(wr,"��");
		FamilyThread ������ = new FamilyThread(wr,"������");
		FamilyThread ������ = new FamilyThread(wr,"������");
		FamilyThread �� = new FamilyThread(wr,"��");
		
		�ƺ�.start();
		����.start();
		��.start();
		������.start();
		������.start();
		��.start();
		
	}

}
