
public class Exam05 {

	public static void main(String[] args) {
		// String 활용
		String str = "hello";

		System.out.println(str.length()); // 문자열의 길이

		System.out.println(str.isEmpty()); // 문자열이 비어있는지 아닌지

		int num = 1;
		String numStr = String.valueOf(num); // String 타입으로 변환해서 반환

		String str2 = "apple,banana,orange";
		String[] array = str2.split(","); // 구분되는 기호(특정 기준)에서 단어를 자름
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

		char c = str.charAt(0); // 문자열을 한 글자씩 자름
		System.out.print(c);
		c = str.charAt(1);
		System.out.print(c);
		c = str.charAt(2);
		System.out.println(c);

		String str3 = "Hello World!! My name is haedo!!";
		String result = str3.substring(0, 5); // 앞의 숫자부터 뒤의 숫자- 1 만큼 자름
		System.out.println(result);
		String result2 = str3.substring(5); // 숫자를 기준으로 앞을 자름
		System.out.println(result2);

		System.out.println(str3.indexOf("World")); // 문자열에서 특정 문자열의 앞글자 인덱스를 찾아줌
	}

}
