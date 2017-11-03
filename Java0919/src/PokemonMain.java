
public class PokemonMain {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		Pokemon squirtle = new Pokemon();
		Pokemon[] pokemon = new Pokemon[2];

		pikachu.name = "��ī��";
		pikachu.type = "����";
		pikachu.hp = 200;
		pikachu.damage = 150;
		pikachu.defensive = 30;
		pikachu.speed = 200;
		pikachu.state = true;
		pokemon[0] = pikachu;

		squirtle.name = "���α�";
		squirtle.type = "��";
		squirtle.hp = 200;
		squirtle.damage = 120;
		squirtle.defensive = 100;
		squirtle.speed = 50;
		squirtle.state = true;
		pokemon[1] = squirtle;

		System.out.println("======== ���ϸ� ��Ʋ ========");

		String name;
		if (pokemon[0].speed > pokemon[1].speed) {
			name = pokemon[0].name;
		} else {
			name = pokemon[1].name;
		}
		System.out.println(name + "�� ������ ���۵Ǿ���!!!");

		while (true) {
			if (name.equals(pokemon[0].name)) {
				int damage = pokemon[0].attack();
				int defensive = pokemon[1].defensive;
				int attack = damage - defensive;
				if (attack < 0) {
					attack *= -1;
				}
				pokemon[1].hp -= attack;
				System.out.println(pokemon[1].name + "�� ü�� : " + pokemon[1].hp);
				name = pokemon[1].name;
				if (pokemon[1].hp < 0) {
					System.out.println(pokemon[0].name + "�� �¸�");
					break;
				}
			} else {
				int damage = pokemon[1].attack();
				int defensive = pokemon[0].defensive;
				int attack = damage - defensive;
				if (attack < 0) {
					attack *= -1;
				}
				pokemon[0].hp -= attack;
				System.out.println(pokemon[0].name + "�� ü�� : " + pokemon[0].hp);
				name = pokemon[0].name;
				if (pokemon[0].hp < 0) {
					System.out.println(pokemon[1].name + "�� �¸�");
					break;
				}
			}
		}
	}

}
