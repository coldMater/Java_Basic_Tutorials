import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "ksh";
		String pw = "12345";
		
		System.out.print("���̵� : ");
		String c_id = sc.next();
		System.out.print("��й�ȣ : ");
		String c_pw = sc.next();
		
		if(id.equals(c_id) && pw.equals(c_pw)) {
			System.out.println("�α��� ����!");
		}
		else {
			System.out.println("�α��� ����");
		}
	}

}