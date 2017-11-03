
public class Exam01 {

	public static void main(String[] args) {
		double kor = 3.84;
		double ch = 6.74;
		double ukr = 1.7;

		bicMaxIndex("한국", kor);
	}

	private static void bicMaxIndex(String country, double bicMacPrice) {
		double us = 5.3;
		double bicMac = us / bicMacPrice;
		System.out.println(country + "의 빅맥지수는 " + bicMac + "입니다.");
	}

}
