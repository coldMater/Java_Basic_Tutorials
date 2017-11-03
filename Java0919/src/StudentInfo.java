
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

	//getter : 우회적 접근
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

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public void setEngGrade(int engGrade) {
		this.engGrade = engGrade;
	}

	public void setKorGrade(int korGrade) {
		this.korGrade = korGrade;
	}
	
	
}
