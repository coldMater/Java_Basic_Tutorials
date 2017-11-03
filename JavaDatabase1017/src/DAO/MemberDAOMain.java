package DAO;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAOMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MemberDAO dao = new MemberDAO();
		
		int result = 0;

		System.out.print("1.select 2.insert 3.update 4.delete 5.end>> ");
		int input = sc.nextInt();

		if (input == 1) {
			ArrayList<Member> list = dao.select();
			
			System.out.println("이름 ");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
		} else if (input == 2) {
			System.out.print("이름 : ");
			String insertName = sc.next();
			System.out.print("번호 : ");
			String insertNum = sc.next();
			System.out.print("나이 : ");
			int insertAge = sc.nextInt();
			Member insertMember = new Member(insertName, insertNum, insertAge);
			result = dao.insert(insertMember);
		} else if (input == 3) {
			System.out.print("변경할 정보의 이름 : ");
			String updateName = sc.next();
			System.out.print("변경할 번호 : ");
			String updateNum = sc.next();
			System.out.print("변경할 나이 : ");
			int updateAge = sc.nextInt();

			Member updateMember = new Member(updateName, updateNum, updateAge);
			result = dao.update(updateMember);
		} else if (input == 4) {
			System.out.print("삭제할 이름 : ");
			String deleteName = sc.next();
			result = dao.delete(deleteName);
		} else if (input == 5) {
			System.out.println("종료");
		}
		
		if(result != 0 && input != 1) {
			System.out.println(result + "개 처리 완료!!");
		} else if(result == 0 && input != 1) {
			System.out.println("처리 실패!");
		}
	}

}
