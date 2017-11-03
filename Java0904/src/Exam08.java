import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sub = num1 > num2 ? num1 - num2 : num2 - num1;
		
		System.out.println("두 수의 차 : " + sub);
		
		/*
		int opr = 0;
		opr += 3;
		
		System.out.println(opr++); // 3
		
		System.out.println(opr); //4
		
		System.out.println(++opr); //5
		
		System.out.println(opr); //5
		
		System.out.println(opr--); //5
		
		System.out.println(opr); //4
		
		System.out.println(--opr); // 3
		
		System.out.println(opr); // 3
		*/
	}

}