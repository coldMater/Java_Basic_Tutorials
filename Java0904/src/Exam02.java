import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력해주세요 : ");
		int orange = sc.nextInt();
		System.out.print("한박스안에 들어갈 오렌지의 개수를 입력해주세요 : ");
		int box = sc.nextInt();

		int value = 0;
		
		value = orange % box == 0 ? orange / box : (orange / box) + 1;
		
		System.out.println("필요한 박스의 개수는 " + value + "개 입니다.");		
	}
	
}