import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//�񸸵� ���
		//������ / ����(m)*����(m)
		//0-18.5 : ��ü�� / 18.5-23 : ���� / 23-25 : ��ü�� / 25-30 : �� / 30- : ����
		
		Scanner sc = new Scanner(System.in);
		
		double weight = 0;
		double height = 0;
		String bmiResult = "";
		
		System.out.println("������ �Է�");
		weight = sc.nextDouble();
		System.out.println("Ű �Է�(m) (ex. 195cm = 1.95m)");
		height = sc.nextDouble();
		
		bmiResult = bmiIndex(weight,height);
		
		System.out.println(bmiResult);
	}

	private static String bmiIndex(double weight, double height) {
		String result = "";
		double bmi = weight / (height * height);
		if(bmi <= 18.5) {
			result = "����� ��ü���Դϴ�.";
		} else if(bmi > 18.5 && bmi <= 23) {
			result = "����� �����Դϴ�.";
		} else if(bmi > 23 && bmi <= 25) {
			result = "����� ��ü���Դϴ�.";
		} else if(bmi > 25 && bmi <= 30) {
			result = "����� ���Դϴ�.";
		} else if(bmi > 30) {
			result = "����� �����Դϴ�.";
		}
		return result;
	}

}
