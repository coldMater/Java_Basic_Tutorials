import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"황해도","이은비","김미희","박병관","차현석"};
		
		System.out.print("입력 : ");
		String input = sc.nextLine();
		
		int num = 0;
		
		for(int i =0; i < arr.length; i++) {
			if(input.equals(arr[i]))
				num = i+1;
		}
		
		System.out.println(num + "번째에 있음");
	}

}
