package Game;

public class GameMain {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		
		//��ĳ����(�ڽ� Ŭ������ �θ�Ŭ������ �� ��ȯ)
		GameCharacter character = new Warrior(); //Warrior�� GameCharacter�� �� ��ȯ, Warrior���� ����� ��� �Ұ�
		
		//�ٿ�ĳ����(�θ�Ŭ������ �ڽ�Ŭ������ �� ��ȯ -> ���� �� ��ȯ�� �ؾ���)
		Warrior warrior2 = (Warrior)character; //GameCharacter�� Warrior�� �� ��ȯ, Warrior�� ��� ��� ����
		warrior2.stun();
	}

}
