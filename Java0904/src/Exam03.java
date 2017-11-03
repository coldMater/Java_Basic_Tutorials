import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		boolean check = num>2 ? true : false ;
				
		System.out.println(check);
		
		System.out.println(num%2==0?"2의 배수입니다.":"2의 배수가 아닙니다.");
	}

}