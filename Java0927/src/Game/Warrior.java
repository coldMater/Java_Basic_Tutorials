package Game;

public class Warrior extends GameCharacter {
	
	@Override
	public void attack() {
		//super.attack(); //super�� ���� ����Ŭ������ �θ���. this�� �� �ڽ��� �θ���.
		System.out.println("Į ����");
	}
	
	public void stun() {
		System.out.println("����");
	}
}
