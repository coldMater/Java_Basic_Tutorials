package Game;

public class GameMain2 {

	public static void main(String[] args) {
		// ������ X
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();

		int choice = 2;

		if (choice == 1) {
			warrior.attack();
			warrior.defense();
		} else if (choice == 2) {
			wizard.attack();
			wizard.defense();
		}
		
		//������ O -> ��� + �������̵� + ��ĳ����
		int choice2 = 1;
		
		GameCharacter character = new Warrior();
		
		character.attack(); //�����ε�
		character.defense();
	}

}
