import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		int sum = 1;
		int num = 0;
		
		for(int i = 0 ; i < input; i++) {
			System.out.print(sum + " ");
			num++;
			sum += num;
			
		}
	}

}
