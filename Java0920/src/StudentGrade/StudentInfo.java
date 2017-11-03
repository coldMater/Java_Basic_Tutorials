package StudentGrade;

public class StudentInfo {
	private String name;
	private String studentNum;
	private int mathGrade;
	private int engGrade;
	private int korGrade;
	
	public StudentInfo(String name, String studentNum, int mathGrade, int engGrade, int korGrade) {
		super();
		this.name = name;
		this.studentNum = studentNum;
		this.mathGrade = mathGrade;
		this.engGrade = engGrade;
		this.korGrade = korGrade;
	}

	public String getName() {
		return name;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public int getMathGrade() {
		return mathGrade;
	}

	public int getEngGrade() {
		return engGrade;
	}

	public int getKorGrade() {
		return korGrade;
	}

	@Override
	public String toString() {
		return "�̸� : " + name + "\t �й� : " + studentNum + "\t ���� : " + mathGrade + "\t ���� : " + engGrade + "\t ���� : " + korGrade;
	}
}
