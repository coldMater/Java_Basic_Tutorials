package StudentGrade;

public class StudentManagementSystem {
	private StudentInfo[] stuList = new StudentInfo[3];
	private int index = 0;

	public boolean isCanAddStudent() {

		return index < stuList.length;
	}

	public void addStudent(String name, String stuNum, int mathScore, int engScore, int korScore) {
		stuList[index++] = new StudentInfo(name, stuNum, mathScore, engScore, korScore);

	}

	public StudentInfo[] getStuList() {
		return stuList;
	}

	public int getIndex() {
		return index;
	}
	
	
}
