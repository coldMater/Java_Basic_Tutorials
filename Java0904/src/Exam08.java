import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int sub = num1 > num2 ? num1 - num2 : num2 - num1;
		
		System.out.println("�� ���� �� : " + sub);
		
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