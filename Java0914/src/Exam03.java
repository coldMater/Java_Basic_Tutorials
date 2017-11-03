
public class Exam03 {

	public static void main(String[] args) {
		String str = "hello";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		String str2 = "hello my name is heado!!";
		String[] array = str2.split(" ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

		System.out.println();

		String str3 = "aPPLe~";
		String result = "";
		for (int i = 0; i < str3.length(); i++) {
			char c;
			if (65 <= str3.charAt(i) && str3.charAt(i) <= 90) {
				c = (char) (str3.charAt(i) + 32);
			} else if (97 <= str3.charAt(i) && str3.charAt(i) <= 122) {
				c = (char) (str3.charAt(i) - 32);
			} else
				c = str3.charAt(i);
			result += c;
		}
		System.out.println(result);

		char[] array1 = str3.toCharArray(); // 문자를 하나씩 잘라 배열로 저장

		for (int i = 0; i < array1.length; i++) {
			if (65 <= array1[i] && array1[i] <= 90) {
				System.out.print((char) (array1[i] + 32));
			} else if (97 <= array1[i] && array1[i] <= 122) {
				System.out.print((char) (array1[i] - 32));
			} else
				System.out.print(array1[i]);
		}
	}

}
