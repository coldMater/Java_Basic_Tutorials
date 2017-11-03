package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhoneManagermentSystem pm = new PhoneManagermentSystem();

		System.out.println("===== 전화번호부 =====");
		while (true) {
			System.out.print("1,등록 2.목록 3.조회 4.수정 5.삭제 6.종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("===== 등록 =====");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("번호 : ");
				String number = sc.next();
				System.out.print("주소 : ");
				String address = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				pm.addPhoneList(name, number, address, age);

			} else if (choice == 2) {
				System.out.println("===== 목록 =====");
				ArrayList<Phone> phone = pm.getPhone();
				for (int i = 0; i < phone.size(); i++) {
					System.out.println((i+1) + " : " + phone.get(i).getName());
				}
			} else if (choice == 3) {
				System.out.println("===== 조회 =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("조회할 이름 : ");
				String searchName = sc.next();
				boolean h = true;
				for (int i = 0; i < phone.size(); i++) {
					if (searchName.equals(phone.get(i).getName())) {
						System.out.println(phone.get(i).toString());
						h = false;
					}
				}
				if (h) {
					System.out.println("존재하지 않음");
				}
			} else if (choice == 4) {
				System.out.println("===== 수정 =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("수정할 이름 : ");
				String changeName = sc.next();
				boolean h = false;
				int index = 0;
				for (int i = 0; i < phone.size(); i++) {
					if (changeName.equals(phone.get(i).getName())) {
						index = i;
						h = true;
					}
				}
				if (h) {
					System.out.print("변경할 이름 : ");
					String name = sc.next();
					System.out.print("변경할 번호 : ");
					String number = sc.next();
					System.out.print("변경할 주소 : ");
					String address = sc.next();
					System.out.print("변경할 나이 : ");
					int age = sc.nextInt();
					
					pm.setPhoneList(name, number, address, age, index);
					/*
					System.out.print("수정할 내용 = 1.이름 2.번호 3.주소 4.나이 = >>");
					int changeChoice = sc.nextInt();
					while (true) {
						if (changeChoice == 1) {
							System.out.print("변경할 이름 : ");
							String name = sc.next();
							phone.get(index).setName(name);
							break;
						} else if (changeChoice == 2) {
							System.out.print("변경할 번호 : ");
							String number = sc.next();
							phone.get(index).setPhoneNum(number);
							break;
						} else if (changeChoice == 3) {
							System.out.print("변경할 주소 : ");
							String address = sc.next();
							phone.get(index).setAddress(address);
							break;
						} else if (changeChoice == 4) {
							System.out.print("변경할 나이 : ");
							int age = sc.nextInt();
							phone.get(index).setAge(age);
							break;
							
						} else {
							System.out.println("잘못된 입력");
						}
					}
					*/
				} else {
					System.out.println("존재하지 않는 이름");
				}
			} else if (choice == 5) {
				System.out.println("===== 삭제 =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("삭제할 이름 : ");
				String deleteName = sc.next();
				for (int i = 0; i < phone.size(); i++) {
					if (deleteName.equals(phone.get(i).getName())) {
						pm.removePhoneList(i);
					}
				}
			} else if (choice == 6) {
				System.out.println("===== 종료 =====");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
			System.out.println();
		}
	}

}
