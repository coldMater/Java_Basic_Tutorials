import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] dnaInfo = { "T", "G", "C", "A", "G", "T", "C", "A", "G", "G", "T", "A", "C", "A", "T", "G", "T", "T", "G", "T", "G", "T", "C", "A" };
		
		System.out.print("패턴 입력 >> ");
		String dna = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i <= dnaInfo.length - dna.length(); i++) {
			String dnacheck = dnaInfo[i];
			for(int j = 1; j < dna.length(); j++) {
				dnacheck += dnaInfo[i+j];
			}
			if (dna.equals(dnacheck)) {
				count++;
			}
		}
		System.out.println("패턴이 같은 경우 : " + count);
	}

}
