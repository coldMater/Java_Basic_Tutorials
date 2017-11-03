package Question05;

public class Question5 {

	public static void main(String[] args) {
		int number = 120;
		
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i;
			System.out.print(i + " ");
			i++;
			if(sum == number) {
				break;
			}
		}
	}

}
