import java.util.Scanner;

public class Answer07 {
	// 파트너 문제
	public static void main(String[] args) {
		String[] book_name = new String[10];
		String[] book_publisher = new String[10];
		String[] book_author = new String[10];
		int[] book_price = new int[10];
		int[] book_grade = new int[10];

		book_name[0] = "어서와 Java는 처음이지?";
		book_price[0] = 33000;
		book_publisher[0] = "인피니티북스";
		book_author[0] = "천인국";
		book_grade[0] = 55;

		book_name[1] = "눈먼자들의 도시";
		book_price[1] = 23000;
		book_publisher[1] = "사계절";
		book_author[1] = "홍길동";
		book_grade[1] = 80;

		book_name[2] = "논리야 놀자";
		book_price[2] = 7650;
		book_publisher[2] = "사계절";
		book_author[2] = "위기철";
		book_grade[2] = 87;

		book_name[3] = "파이썬을 이용한 빅데이터 수집, 분석과 시각화";
		book_price[3] = 21600;
		book_publisher[3] = "비팬북스";
		book_author[3] = "이원화";
		book_grade[3] = 63;
		
		int book_size = 4;

		System.out.println("======도서관리 프로그램======");
		
		while (true) {
			System.out.print("1.도서검색 2.도서검색 3.도서정보 4.평점보기 5.종료 >> ");
			int choice = new Scanner(System.in).nextInt();
			
			boolean book_check = true;

			if (choice == 1) { //도서검색
				System.out.println("===== 도서 검색 =====");
				System.out.println("검색할 도서의 이름을 입력해주세요.");
				String search_book_name = new Scanner(System.in).nextLine();
				
				for(int i = 0; i < book_name.length; i++) {
					if(search_book_name.equals(book_name[i])) {
						System.out.println(book_name[i] + " 의 책을 현재 보유중입니다.");
						book_check = false;
					}
				}
				
			if(book_check) {
				System.out.println("찾으시는 책이 존재하지 않습니다.");
			}
			} else if (choice == 2) { //도서등록
				System.out.println("===== 도서 등록 =====");
				if(book_size > 9) {
					System.out.println("더이상 등록이 불가능합니다.");
					continue;
				}
				Scanner sc = new Scanner(System.in);
				
				System.out.println("도서이름 : ");
				String new_book_name = new Scanner(System.in).nextLine();
				
				System.out.println("도서가격 : ");
				int new_book_price = sc.nextInt();
				
				System.out.println("도서출판사 : ");
				String new_book_publisher = new Scanner(System.in).nextLine();
				
				System.out.println("도서지은이 : ");
				String new_book_author = new Scanner(System.in).nextLine();
				
				System.out.println("도서평점 : ");
				int new_book_grade = sc.nextInt();
				
				book_name[book_size] = new_book_name;
				book_price[book_size] = new_book_price;
				book_publisher[book_size] = new_book_publisher;
				book_author[book_size] = new_book_author;
				book_grade[book_size] = new_book_grade;
				System.out.println("등록완료");
				book_size++;
				
			} else if (choice == 3) { //도서정보
				System.out.println("===== 도서 정보");
				System.out.println("정보를 얻고 싶은 도서의 이름을 입력해주세요.");
				String info_search_book_name = new Scanner(System.in).nextLine();
				
				boolean book_check2 = true;
				
				for (int i = 0; i < book_name.length; i++) {
					if(info_search_book_name.equals(book_name[i])) {
						System.out.println("도서이름\t\t도서가격\t출판사\t지은이\t평점");
						System.out.println(book_name[i] + "\t\t" + book_price[i] + "\t" + book_publisher[i] + "\t" + book_author[i] + "\t" + book_grade[i]);
					}
				}
			} else if (choice == 4) { //평점보기
				System.out.println("===== 평점 보기 =====");
				int[] ns = new int[book_size];
				
				for (int i = 0; i < ns.length; i++) {
					ns[i] = book_grade[i] /10;
				}
				
				for (int i = 10; i > 0; i--) {
					System.out.print(i * 10 + "\t\t\t");
					for (int j = 0; j < book_size; j++) {
						if(i <= ns[j]) {
							System.out.print("*\t\t\t\t\t");
						} else {
							System.out.print("\t\t\t\t\t");
						}
					}
					System.out.println();
				}
				System.out.print("\t");
				
				for (int i = 0; i < ns.length; i++) {
					System.out.print(book_name[i] + "\t\t");
				}
				System.out.println();
			} else if (choice == 5) { //종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else { //그 이외의 숫자
				System.out.println("정확한 숫자를 다시 입력해주십시오.");
			}
		}
	}

}
