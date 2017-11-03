
public class Exam05 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '+';

		System.out.println(cal(num1, num2, op));
	}

	private static String cal(int num1, int num2, char op) {
		String result = "";
		switch (op) {
		case '+':
			result = "" + (num1 + num2); break;
		case '-':
			result = "" + (num1 - num2); break;
		case '*':
			result = "" + (num1 * num2); break;
		case '/':
			result = "" + (num1 / num2); break;
		default:
			result = "잘못된 연산자 입력"; break;
		}
		return result;
	}

	// private static int cal(int num1, int num2, char op) {
	// int result = 0;
	// switch (op) {
	// case '+':
	// result = num1 + num2; break;
	// case '-':
	// result = num1 - num2; break;
	// case '*':
	// result = num1 * num2; break;
	// case '/':
	// result = num1 / num2; break;
	// }
	// return result;
	// }

}
