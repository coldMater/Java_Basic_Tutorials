import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//비만도 계산
		//몸무게 / 신장(m)*신장(m)
		//0-18.5 : 저체중 / 18.5-23 : 정상 / 23-25 : 과체중 / 25-30 : 비만 / 30- : 고도비만
		
		Scanner sc = new Scanner(System.in);
		
		double weight = 0;
		double height = 0;
		String bmiResult = "";
		
		System.out.println("몸무게 입력");
		weight = sc.nextDouble();
		System.out.println("키 입력(m) (ex. 195cm = 1.95m)");
		height = sc.nextDouble();
		
		bmiResult = bmiIndex(weight,height);
		
		System.out.println(bmiResult);
	}

	private static String bmiIndex(double weight, double height) {
		String result = "";
		double bmi = weight / (height * height);
		if(bmi <= 18.5) {
			result = "당신은 저체중입니다.";
		} else if(bmi > 18.5 && bmi <= 23) {
			result = "당신은 정상입니다.";
		} else if(bmi > 23 && bmi <= 25) {
			result = "당신은 과체중입니다.";
		} else if(bmi > 25 && bmi <= 30) {
			result = "당신은 비만입니다.";
		} else if(bmi > 30) {
			result = "당신은 고도비만입니다.";
		}
		return result;
	}

}
