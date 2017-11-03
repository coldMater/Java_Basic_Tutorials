import java.util.Random;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Exam01 {

	public static void main(String[] args) {
		Random rd = new Random();
	
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = rd.nextInt(20)+1;
			System.out.print( i + " : " + arr[i]+ "\t\t");
			sum += arr[i];
		}
		System.out.println("\n¹è¿­ÀÇ ÃÑÇÕ : " + sum);
	}

}