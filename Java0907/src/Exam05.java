import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"Ȳ�ص�","������","�����","�ں���","������"};
		
		System.out.print("�Է� : ");
		String input = sc.nextLine();
		
		int num = 0;
		
		for(int i =0; i < arr.length; i++) {
			if(input.equals(arr[i]))
				num = i+1;
		}
		
		System.out.println(num + "��°�� ����");
	}

}
