package Question08;

import java.util.Scanner;

public class GreetingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		GreetingProgram greeting = new GreetingProgram();
		greeting.setLanguage(new Korean());
		greeting.greet(name);
		
		scan.close();
	}

}
