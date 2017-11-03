
public class Exam02 {

	public static void main(String[] args) {
		int result = LargerNumber(10,15);
		System.out.println(result);
	}

	private static int LargerNumber(int i, int j) {
		if(i > j) return i;
		else return j;
	}

}
