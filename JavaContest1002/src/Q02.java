
public class Q02 {

	public static void main(String[] args) {
		int mul = 0;
		int j = 1;
		
		for (int i = 77; i > 0; i--) {
			mul = mul + (i*j);
			j++;
		}
		
		System.out.println(mul);
	}

}
