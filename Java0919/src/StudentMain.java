
public class StudentMain {

	public static void main(String[] args) {
		StudentInfo stu = new StudentInfo("�̸�", "123456", 90, 80, 70);
		
		//stu.engGrade = 10; // private�� ���� �ܺο��� ���ٺҰ�
		
		System.out.println(stu.getName());
		
		int math = stu.getMathGrade();
		int kor = stu.getKorGrade();
		int eng = stu.getEngGrade();
		
		System.out.println("��� : " + (math + kor + eng)/3f);
	}

}
