
public class exam02 {

	public static void main(String[] args) {
		int orange = 101;
		int number = 10;
		int box = 0;
		
		box = (orange%number) == 0? orange/number : orange/number+1;
		
		System.out.println("박스의 개수는? " + box);
	}

}
