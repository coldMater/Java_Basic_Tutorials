package Game;

public class GameMain {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		
		//업캐스팅(자식 클래스를 부모클래스로 형 변환)
		GameCharacter character = new Warrior(); //Warrior를 GameCharacter로 형 변환, Warrior만의 기능은 사용 불가
		
		//다운캐스팅(부모클래스를 자식클래스로 형 변환 -> 강제 형 변환을 해야함)
		Warrior warrior2 = (Warrior)character; //GameCharacter를 Warrior로 형 변환, Warrior의 기능 사용 가능
		warrior2.stun();
	}

}
