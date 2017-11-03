
public class Exam02 {

	public static void main(String[] args) {
		int[] student1 = { 85, 45, 70, 80, 40 };

		int sum = 0;
		int avg = 0;
//		int min = student1[0];
		boolean relapse = true;

		for (int i = 0; i < student1.length; i++) {
			sum += student1[i];
			if(student1[i] < 40)
				relapse = false;
//			if (min > student1[i])
//				min = student1[i];
		}
		
		if(relapse) {
			avg = sum / student1.length;
			if(avg >= 60) {
				System.out.println("합격입니다. 평균 : " + avg);
			} else {
				System.out.println("불합격입니다. 평균 : " + avg);
			}
		} else {
			System.out.println("과락입니다.");
		}
//		avg = sum / student1.length;
//		if (min <= 40) {
//			System.out.println("과락입니다." + avg);
//		} else if (avg >= 60) {
//			System.out.println("합격입니다. 평균 : " + avg);
//		} else {
//			System.out.println("불합격입니다. 평균 : " + avg);
//		}
	}

}
