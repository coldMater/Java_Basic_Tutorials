import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java ���� : ");
		int javaScore = sc.nextInt();
		System.out.print("Web ���� : ");
		int webScore = sc.nextInt();
		System.out.print("Android ���� : ");
		int androidScore = sc.nextInt();
		
		int sum = javaScore + webScore + androidScore;
		int avg = sum / 3;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}