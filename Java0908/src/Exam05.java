
public class Exam05 {

	public static void main(String[] args) {
		int[][] coin = {{500, 100, 50, 10}, {20, 30, 15, 3}};
		
		int coinValue = 0;
		
		for(int i = 0; i < coin[0].length; i++) {
			coinValue = coin[0][i] * coin[1][i];
			System.out.println(coin[0][i] + "¿ø : " + coin[1][i] + "°³ \t" + coinValue + "¿ø");
		}
	}

}