
public class StudentMain {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo("이름", "123456", 90, 80, 70);
		
		//stu.engGrade = 10; // private을 통해 외부에서 접근불가
		
		System.out.println(stu.getName());
		
		int math = stu.getMathGrade();
		int kor = stu.getKorGrade();
		int eng = stu.getEngGrade();
		
		System.out.println("평균 : " + (math + kor + eng)/3f);
	}

}
