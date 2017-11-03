package StudentGrade;

import java.util.Scanner;

public class Studnet {

	public static void main(String[] args) {

		StudentManagementSystem sm = new StudentManagementSystem();

		System.out.println("===== 학생관리 프로그램 =====");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.등록  2.조회  3.종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				if (sm.isCanAddStudent()) {
					System.out.print("이름 : ");
					String name = sc.next();
					System.out.print("학번 : ");
					String stuNum = sc.next();
					System.out.print("수학점수 : ");
					int mathScore = sc.nextInt();
					System.out.print("영어점수 : ");
					int engScore = sc.nextInt();
					System.out.print("국어점수 : ");
					int korScore = sc.nextInt();

					sm.addStudent(name, stuNum, mathScore, engScore, korScore);
				} else {
					System.out.println("등록인원 초과");
				}
			} else if (choice == 2) {
				StudentInfo[] stuList = sm.getStuList();
				for (int i = 0; i < sm.getIndex(); i++) {
					System.out.println((i + 1) + "번 학생 >> " + stuList[i]);
					// System.out.println("이름 \t 학번 \t 수학 \t 영어 \t 국어");
					// System.out.println(stuList[i].getName() + " \t " + stuList[i].getStudentNum()
					// + " \t "
					// + stuList[i].getMathGrade() + " \t\t " + stuList[i].getEngGrade() + " \t\t "
					// + stuList[i].getKorGrade());
				}
			} else if (choice == 3) {
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		}
	}

}
