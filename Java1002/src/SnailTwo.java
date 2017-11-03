import java.util.Scanner;

public class SnailTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		int[][] snail = new int[input][input];
		
		int sw = 1;
		int row = 0;
		int col = -1;
		int count = 1;
		
		while(true) {
			for (int i = 0; i < input; i++) {
				col += sw;
				snail[row][col] = count++;
			}
			
			input--;
			
			if(input == 0) {
				break;
			}
			
			for (int i = 0; i < input; i++) {
				row += sw;
				snail[row][col] = count++;
			}
			
			sw *= -1;
		}
		
		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail[i].length; j++) {
				System.out.print(snail[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
