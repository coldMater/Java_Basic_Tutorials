import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id = "ksh";
		String pw = "12345";
		
		System.out.print("아이디 : ");
		String c_id = sc.next();
		System.out.print("비밀번호 : ");
		String c_pw = sc.next();
		
		if(id.equals(c_id) && pw.equals(c_pw)) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}