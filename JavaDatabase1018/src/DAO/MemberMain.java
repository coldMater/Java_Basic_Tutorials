package DAO;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.print("�˻��� �̸� : ");
		String selectName = sc.next();
		Member select = dao.selectOneByName(selectName);

		if (select == null) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			System.out.println(select.getName() + ", " + select.getPhoneNum() + ", " + select.getAge());
		}

		MemberDAO dao1 = new MemberDAO();
		ArrayList<Member> memberList = dao1.selectAll();

		if (memberList.size() == 0) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			System.out.println("�̸� \t ��ȣ \t ����");
			for (int i = 0; i < memberList.size(); i++) {
				System.out.println(memberList.get(i).getName() + " \t\t " + memberList.get(i).getPhoneNum() + " \t "
						+ memberList.get(i).getAge());
			}
		}
	}

}
