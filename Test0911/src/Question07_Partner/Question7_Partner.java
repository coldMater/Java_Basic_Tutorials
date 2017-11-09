package Question07_Partner;

import java.util.Scanner;

public class Question7_Partner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] book_name = new String[10];
		String[] book_publisher = new String[10];
		String[] book_author = new String[10];
		int[] book_price = new int[10];
		int[] book_grade = new int[10];
		int num = 0;
		int i = 0;

		while (true) {
			System.out.println("============= 도서 관리 프로그램 =============");
			System.out.print("1.도서검색 2.도서등록 3.도서정보 4.평점보기 5.종료 >> ");
			num = sc.nextInt();

			if (num == 1) {
				int k = 0;
				System.out.println("=== 도서 검색 ===");
				System.out.println("검색할 도서의 이름을 입력해주세요.");
				String name = sc.next();

				for (int j = 0; j < book_name.length; j++) {
					if (name.equals(book_name[j])) {
						System.out.println(name + "의 책을 현재 보유중입니다.");
						break;
					} else {
						k++;
					}
				}
				if (k == 10) {
					System.out.println("찾으시는 책이 존재하지 않습니다.");
				}
			} else if (num == 2) {
				System.out.println("=== 도서 등록 ===");
				if (i < 10) {
					System.out.print("도서이름 : ");
					String name = sc.next();
					System.out.print("도서가격 : ");
					int price = sc.nextInt();
					System.out.print("도서출판사 : ");
					String publisher = sc.next();
					System.out.print("도서지은이 : ");
					String author = sc.next();
					System.out.print("도서평점 : ");
					int grade = sc.nextInt();

					book_name[i] = name;
					book_price[i] = price;
					book_publisher[i] = publisher;
					book_author[i] = author;
					book_grade[i] = grade;

					System.out.println(book_name[i] + " 등록 완료!!");
					i++;
				} else {
					System.out.println("더 이상 등록이 불가능 합니다.");
				}
			} else if (num == 3) {
				int k=0;
				System.out.println("===== 도서 정보 =====");
				System.out.println("정보를 얻고 싶은 도서의 이름을 입력해주세요.");
				String bookname_input = sc.next();
				for (int j = 0; j < book_name.length; j++) {
					if(bookname_input.equals(book_name[j])) {
						System.out.println("도서이름 \t 도서가격 \t 출판사 \t 지은이 \t 평점");
						System.out.println(book_name[j] + "  \t  " + book_price[j] + "  \t  " + book_publisher[j] + "  \t  " + book_author[j] + "  \t  " + book_grade[j]);
						break;
					} else {
						k++;
					}
				}
				if(k == 10) {
					System.out.println("정보를 얻고자 하는 책이 존재하지 않습니다.");
				}

			} else if (num == 4) {
				System.out.println("===== 평점 보기 =====");
				for (int l = 0; l < book_grade.length; l++) {
					System.out.print(100 - (l * 10));
					for (int j = 0; j < book_grade.length; j++) {
						int grade = book_grade[j] - (book_grade[j] % 10);
						if(grade < 100 - (l * 10)) {
							System.out.print("\t");
						}
						if(grade >= 100 - (l * 10)) {
							System.out.print("\t*");
						}
					}
					System.out.println();
				}
				for (int j = 0; j < i; j++) {
					System.out.print("\t" + book_name[j]);
				}
				System.out.println();
			} else if (num == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해 주십시오.");
			}
		}
	}

}
