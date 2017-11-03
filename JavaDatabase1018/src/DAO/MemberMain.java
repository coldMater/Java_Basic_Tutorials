package DAO;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();

		System.out.print("검색할 이름 : ");
		String selectName = sc.next();
		Member select = dao.selectOneByName(selectName);

		if (select == null) {
			System.out.println("검색결과가 없습니다.");
		} else {
			System.out.println(select.getName() + ", " + select.getPhoneNum() + ", " + select.getAge());
		}

		MemberDAO dao1 = new MemberDAO();
		ArrayList<Member> memberList = dao1.selectAll();

		if (memberList.size() == 0) {
			System.out.println("검색결과가 없습니다.");
		} else {
			System.out.println("이름 \t 번호 \t 나이");
			for (int i = 0; i < memberList.size(); i++) {
				System.out.println(memberList.get(i).getName() + " \t\t " + memberList.get(i).getPhoneNum() + " \t "
						+ memberList.get(i).getAge());
			}
		}
	}

}
