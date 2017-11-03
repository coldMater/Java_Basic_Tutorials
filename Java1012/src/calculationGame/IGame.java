package calculationGame;

public interface IGame {
	//난수 생성
	public void makeRandomNumber();
	
	//게임메시지
	public String makeQuizMsg();
	
	//정답체크
	public boolean checkAnswer(int answer);
}
