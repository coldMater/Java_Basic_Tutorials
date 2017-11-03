package Game;

public class GameMain2 {

	public static void main(String[] args) {
		// 다형성 X
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
		
		//다형성 O -> 상속 + 오버라이딩 + 업캐스팅
		int choice2 = 1;
		
		GameCharacter character = new Warrior();
		
		character.attack(); //동적로딩
		character.defense();
	}

}
