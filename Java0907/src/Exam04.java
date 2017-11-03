import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] answer = {1,2,3,4,5};
		int[] inputAnswer = new int[5];
		
		System.out.println("=== 채점하기 ===");
		System.out.println("답을 입력하세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print( (i+1) + "번답 >> ");
			inputAnswer[i] = sc.nextInt();
		}
		
		System.out.println("정답확인");
		
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(answer[i] == inputAnswer[i]) {
				System.out.print("O\t");
				count++;
			}
			else
				System.out.print("X\t");
		}
		
		System.out.println("총 점 : " + count*20);
	}

}
