import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록...";
		long startTime = System.currentTimeMillis();
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		String ty_str = sc.nextLine();
		long endTime = System.currentTimeMillis();
		
		if(str.equals(ty_str)) {
			System.out.println("문장이 맞았습니다.");
			long time = (endTime - startTime) / 1000;
			System.out.println(time + "초 걸렸습니다.");
		}
		else {
			System.out.println("문장이 틀렸습니다.");
		}
	}

}