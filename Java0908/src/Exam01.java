import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"수", "박"};
		
		System.out.println("==== 수박게임 Start! ====");
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i%2]);
			
//			System.out.print(i%2==0?arr[0]:arr[1]);
			
//			if(i % 2 == 0) {
//				System.out.print(arr[0]);
//			} else {
//				System.out.print(arr[1]);
//			}
		}
	}

}