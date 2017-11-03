package calculationGame;

import java.util.Scanner;

public class ArithmeticGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] falseAnswer = {"�ٽ� ������ �����?", "�� �� ��!", "�׳� ���� ������ �Ѿ��..."};

		PlusGame plusGame = new PlusGame();
		MinusGame minusGame = new MinusGame();
		MultiplicationGame multiplicationGame = new MultiplicationGame();
		DivisionGame divisionGame = new DivisionGame();
		IGame game = plusGame;

		int answer = 0;

		for (int gameCnt = 0; gameCnt < 5; gameCnt++) {
			game.makeRandomNumber();
			String question = game.makeQuizMsg();
			for (int answerCnt = 0; answerCnt < 3; answerCnt++) {
				System.out.print(question);
				answer = sc.nextInt();

				if (game.checkAnswer(answer)) {
					System.out.println("�� ������!");
					break;
				} else {
					System.out.println(falseAnswer[answerCnt]);
				}
			}
		}
		/*
		while (gameCnt < 5) {
			System.out.print(question);
			answer = sc.nextInt();
			
			if (game.checkAnswer(answer)) {
				System.out.println("�� ������!");
				question = game.makeQuizMsg();
				gameCnt++;
				answerCnt = 0;
				continue;
			} else {
				answerCnt++;
				if (answerCnt >= 3) {
					System.out.println("�׳� ���� ������ �Ѿ��...");
					question = game.makeQuizMsg();
					answerCnt = 0;
					gameCnt++;
					
					continue;
				} else if(answerCnt == 1) {
					System.out.println("�ٽ� ������ �����?");
				} else if(answerCnt == 2) {
					System.out.println("�� �� ��!");
				}
			}
		}
*/
		System.out.println("�����մϴ�.");
	}

}
