package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhoneManagermentSystem pm = new PhoneManagermentSystem();

		System.out.println("===== ��ȭ��ȣ�� =====");
		while (true) {
			System.out.print("1,��� 2.��� 3.��ȸ 4.���� 5.���� 6.���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("===== ��� =====");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("��ȣ : ");
				String number = sc.next();
				System.out.print("�ּ� : ");
				String address = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				
				pm.addPhoneList(name, number, address, age);

			} else if (choice == 2) {
				System.out.println("===== ��� =====");
				ArrayList<Phone> phone = pm.getPhone();
				for (int i = 0; i < phone.size(); i++) {
					System.out.println((i+1) + " : " + phone.get(i).getName());
				}
			} else if (choice == 3) {
				System.out.println("===== ��ȸ =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("��ȸ�� �̸� : ");
				String searchName = sc.next();
				boolean h = true;
				for (int i = 0; i < phone.size(); i++) {
					if (searchName.equals(phone.get(i).getName())) {
						System.out.println(phone.get(i).toString());
						h = false;
					}
				}
				if (h) {
					System.out.println("�������� ����");
				}
			} else if (choice == 4) {
				System.out.println("===== ���� =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("������ �̸� : ");
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
					System.out.print("������ �̸� : ");
					String name = sc.next();
					System.out.print("������ ��ȣ : ");
					String number = sc.next();
					System.out.print("������ �ּ� : ");
					String address = sc.next();
					System.out.print("������ ���� : ");
					int age = sc.nextInt();
					
					pm.setPhoneList(name, number, address, age, index);
					/*
					System.out.print("������ ���� = 1.�̸� 2.��ȣ 3.�ּ� 4.���� = >>");
					int changeChoice = sc.nextInt();
					while (true) {
						if (changeChoice == 1) {
							System.out.print("������ �̸� : ");
							String name = sc.next();
							phone.get(index).setName(name);
							break;
						} else if (changeChoice == 2) {
							System.out.print("������ ��ȣ : ");
							String number = sc.next();
							phone.get(index).setPhoneNum(number);
							break;
						} else if (changeChoice == 3) {
							System.out.print("������ �ּ� : ");
							String address = sc.next();
							phone.get(index).setAddress(address);
							break;
						} else if (changeChoice == 4) {
							System.out.print("������ ���� : ");
							int age = sc.nextInt();
							phone.get(index).setAge(age);
							break;
							
						} else {
							System.out.println("�߸��� �Է�");
						}
					}
					*/
				} else {
					System.out.println("�������� �ʴ� �̸�");
				}
			} else if (choice == 5) {
				System.out.println("===== ���� =====");
				ArrayList<Phone> phone = pm.getPhone();
				System.out.print("������ �̸� : ");
				String deleteName = sc.next();
				for (int i = 0; i < phone.size(); i++) {
					if (deleteName.equals(phone.get(i).getName())) {
						pm.removePhoneList(i);
					}
				}
			} else if (choice == 6) {
				System.out.println("===== ���� =====");
				break;
			} else {
				System.out.println("�߸��� �Է�");
			}
			System.out.println();
		}
	}

}
