package calculationGame;

public interface IGame {
	//���� ����
	public void makeRandomNumber();
	
	//���Ӹ޽���
	public String makeQuizMsg();
	
	//����üũ
	public boolean checkAnswer(int answer);
}
