import java.util.Random;
import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num1 = rd.nextInt(9)+1;
		int num2 = rd.nextInt(9)+1;
		int sum = 0;
		String yorn = "";
		
		System.out.println("==Plus Game==");
		do {
			
			System.out.print(num1 + "+" + num2 + "=");
			sum = sc.nextInt();
			
			if(num1+num2 == sum) {
				System.out.println("Success");
				num1 = rd.nextInt(9)+1;
				num2 = rd.nextInt(9)+1;
			} else {
				System.out.println("Fail");
			}
			
			System.out.print("��� �Ͻðڽ��ϱ�?(y:yes, n:no) >> ");
			yorn = sc.next();
			if(yorn.equals("y"))
				continue;
			else if(yorn.equals("n"))
				break;
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.print("��� �Ͻðڽ��ϱ�?(y:yes, n:no) >> ");
				yorn = sc.next();
				if(yorn.equals("y"))
					continue;
				else if(yorn.equals("n"))
					break;
			}
			
		} while (true);
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
