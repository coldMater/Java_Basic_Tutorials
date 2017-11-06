
public class Q10 {

	public static void main(String[] args) {
		System.out.println(caesar("a B y", 4));
	}

	private static String caesar(String string, int num) {
		char[] caesarF = new char[string.length()];
		String answer = "";
		
		for (int j = 0; j < string.length(); j++) {
			caesarF[j] = string.charAt(j);
		}
		
		for (int i = 0; i < caesarF.length; i++) {
			if(caesarF[i] >= 'A' && caesarF[i] <= 'Z') {
				char ch = ((char)(caesarF[i] + num));
				caesarF[i] = ch;
			} else if(caesarF[i] >= 'a' && caesarF[i] <= 'z') {
				char ch = ((char)(caesarF[i] + num));
				caesarF[i] = ch;
			}
		}
		
		for (int i = 0; i < caesarF.length; i++) {
			if(caesarF[i] > 'Z' && caesarF[i] < 'a') {
				char ch = ((char)('A' + (caesarF[i] - 'z') - 1));
				caesarF[i] = ch;
			} else if(caesarF[i] > 'z') {
				char ch = ((char)('a' + (caesarF[i] - 'z') - 1));
				caesarF[i] = ch;
			}
		}
		
		for (int i = 0; i < caesarF.length; i++) {
			answer += caesarF[i];
		}
		return answer;
	}

}
