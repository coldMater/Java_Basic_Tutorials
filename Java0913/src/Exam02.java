import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstMoney = 0;
		double interest = 0;
		int month = 0;
		double endMoney = 0;
		
		System.out.println("투자할 원금을 입력해 주십시오.");
		firstMoney = sc.nextInt();
		System.out.println("이자율을 입력해 주십시오.");
		interest = sc.nextDouble();
		System.out.println("투자기간을 입력해 주십시오.(월 단위)");
		month = sc.nextInt();
		
		endMoney = bank(firstMoney,interest,month);
		
		System.out.println(month + "개월동안 얻는 이자는 " + endMoney + "원 입니다.");
	}

	private static double bank(int firstMoney, double interest, int month) {
		double value = firstMoney*(Math.pow((1+interest), month/12));
		return value;
	}

}
