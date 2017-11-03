
public class Pokemon {
	String name;
	String type;
	int hp;
	int damage;
	int defensive;
	int speed;
	boolean state;
	
	public Pokemon() {
		
	}
	
	public Pokemon(String name, String type, int hp, int damage, int defensive, int speed, boolean state) {
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.damage = damage;
		this.defensive = defensive;
		this.speed = speed;
		this.state = state;
	}



	public int attack() {
		System.out.println(name + "공격 차례!!");
		System.out.println(name + " 공격합니다.");
		return damage;
	}
}
