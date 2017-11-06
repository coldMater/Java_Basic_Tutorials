package toilet;

public class ThreadTest {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread 아빠 = new FamilyThread(wr,"아빠");
		FamilyThread 엄마 = new FamilyThread(wr,"엄마");
		FamilyThread 형 = new FamilyThread(wr,"형");
		FamilyThread 남동생 = new FamilyThread(wr,"남동생");
		FamilyThread 여동생 = new FamilyThread(wr,"여동생");
		FamilyThread 나 = new FamilyThread(wr,"나");
		
		아빠.start();
		엄마.start();
		형.start();
		남동생.start();
		여동생.start();
		나.start();
		
	}

}
