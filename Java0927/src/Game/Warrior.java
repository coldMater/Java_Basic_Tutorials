package Game;

public class Warrior extends GameCharacter {
	
	@Override
	public void attack() {
		//super.attack(); //super는 나의 상위클래스를 부른다. this는 나 자신을 부른다.
		System.out.println("칼 공격");
	}
	
	public void stun() {
		System.out.println("기절");
	}
}
