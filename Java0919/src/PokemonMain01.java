
public class PokemonMain01 {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("��ī��", "����", 200, 150, 30, 200, true);
		Pokemon squirtle = new Pokemon("���α�", "��", 200, 120, 100, 50, true);
		Pokemon[] pokemon = new Pokemon[2];

//		pikachu.name = "��ī��";
//		pikachu.type = "����";
//		pikachu.hp = 200;
//		pikachu.damage = 150;
//		pikachu.defensive = 30;
//		pikachu.speed = 200;
//		pikachu.state = true;
//		pokemon[0] = pikachu;
//
//		squirtle.name = "���α�";
//		squirtle.type = "��";
//		squirtle.hp = 200;
//		squirtle.damage = 120;
//		squirtle.defensive = 100;
//		squirtle.speed = 50;
//		squirtle.state = true;
//		pokemon[1] = squirtle;

		System.out.println("======== ���ϸ� ��Ʋ ========");

		if (pokemon[0].speed > pokemon[1].speed) {
			while(true) {
				if(pikachu.state==false) {
					System.out.println("���α��� �¸�");
					break;
				} else if(squirtle.state==false) {
					System.out.println("��ī���� �¸�");
					break;
				}
				
				System.out.println(pikachu.name+"�� ��������!!");
				squirtle.hp += squirtle.defensive - pikachu.attack();
				System.out.println(squirtle.name + "ü�� : " + squirtle.hp);
				
				System.out.println(squirtle.name+"�� ��������!!");
				pikachu.hp += pikachu.defensive - squirtle.attack();
				System.out.println(pikachu.name + "ü�� : " + pikachu.hp);
				
				if(pikachu.hp <= 0) {
					pikachu.state = false;
				} else if(squirtle.hp <= 0) {
					squirtle.state = false;
				}
			}
		} else {
			
		}

	}

}
