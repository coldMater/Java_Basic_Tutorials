import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] answer = {1,2,3,4,5};
		int[] inputAnswer = new int[5];
		
		System.out.println("=== ä���ϱ� ===");
		System.out.println("���� �Է��ϼ���.");
		for (int i = 0; i < 5; i++) {
			System.out.print( (i+1) + "���� >> ");
			inputAnswer[i] = sc.nextInt();
		}
		
		System.out.println("����Ȯ��");
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(answer[i] == inputAnswer[i]) {
				System.out.print("O\t");
				count++;
			}
			else
				System.out.print("X\t");
		}
		
		System.out.println("�� �� : " + count*20);
	}

}
