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
			
			System.out.println("�̸� ");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
		} else if (input == 2) {
			System.out.print("�̸� : ");
			String insertName = sc.next();
			System.out.print("��ȣ : ");
			String insertNum = sc.next();
			System.out.print("���� : ");
			int insertAge = sc.nextInt();
			Member insertMember = new Member(insertName, insertNum, insertAge);
			result = dao.insert(insertMember);
		} else if (input == 3) {
			System.out.print("������ ������ �̸� : ");
			String updateName = sc.next();
			System.out.print("������ ��ȣ : ");
			String updateNum = sc.next();
			System.out.print("������ ���� : ");
			int updateAge = sc.nextInt();

			Member updateMember = new Member(updateName, updateNum, updateAge);
			result = dao.update(updateMember);
		} else if (input == 4) {
			System.out.print("������ �̸� : ");
			String deleteName = sc.next();
			result = dao.delete(deleteName);
		} else if (input == 5) {
			System.out.println("����");
		}
		
		if(result != 0 && input != 1) {
			System.out.println(result + "�� ó�� �Ϸ�!!");
		} else if(result == 0 && input != 1) {
			System.out.println("ó�� ����!");
		}
	}

}
