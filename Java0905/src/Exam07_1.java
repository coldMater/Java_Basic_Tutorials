import java.util.Scanner;

public class Exam07_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VendingMachine vendingMachine = new VendingMachine();
		
		int inputMoney = 0;
		int inputMenuNum = 0;
//		int won1000cnt = 0;
//		int won500cnt = 0;
//		int won100cnt = 0;
		int requireMoney = 0;
		
		inputMoney = vendingMachine.InputMoney(sc);
		
		inputMenuNum = vendingMachine.InputMenu(sc);
		
		vendingMachine.CalAndShow(inputMoney, inputMenuNum, requireMoney);
	}
	
}