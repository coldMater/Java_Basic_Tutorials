
public class Exam05 {

	public static void main(String[] args) {
		// String Ȱ��
		String str = "hello";

		System.out.println(str.length()); // ���ڿ��� ����

		System.out.println(str.isEmpty()); // ���ڿ��� ����ִ��� �ƴ���

		int num = 1;
		String numStr = String.valueOf(num); // String Ÿ������ ��ȯ�ؼ� ��ȯ

		String str2 = "apple,banana,orange";
		String[] array = str2.split(","); // ���еǴ� ��ȣ(Ư�� ����)���� �ܾ �ڸ�
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

		char c = str.charAt(0); // ���ڿ��� �� ���ھ� �ڸ�
		System.out.print(c);
		c = str.charAt(1);
		System.out.print(c);
		c = str.charAt(2);
		System.out.println(c);

		String str3 = "Hello World!! My name is haedo!!";
		String result = str3.substring(0, 5); // ���� ���ں��� ���� ����- 1 ��ŭ �ڸ�
		System.out.println(result);
		String result2 = str3.substring(5); // ���ڸ� �������� ���� �ڸ�
		System.out.println(result2);

		System.out.println(str3.indexOf("World")); // ���ڿ����� Ư�� ���ڿ��� �ձ��� �ε����� ã����
	}

}
