import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵��...";
		long startTime = System.currentTimeMillis();
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		String ty_str = sc.nextLine();
		long endTime = System.currentTimeMillis();
		
		if(str.equals(ty_str)) {
			System.out.println("������ �¾ҽ��ϴ�.");
			long time = (endTime - startTime) / 1000;
			System.out.println(time + "�� �ɷȽ��ϴ�.");
		}
		else {
			System.out.println("������ Ʋ�Ƚ��ϴ�.");
		}
	}

}