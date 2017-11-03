
public class PokemonMain01 {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon("ÇÇÄ«Ãò", "Àü±â", 200, 150, 30, 200, true);
		Pokemon squirtle = new Pokemon("²¿ºÎ±â", "¹°", 200, 120, 100, 50, true);
		Pokemon[] pokemon = new Pokemon[2];

//		pikachu.name = "ÇÇÄ«Ãò";
//		pikachu.type = "Àü±â";
//		pikachu.hp = 200;
//		pikachu.damage = 150;
//		pikachu.defensive = 30;
//		pikachu.speed = 200;
//		pikachu.state = true;
//		pokemon[0] = pikachu;
//
//		squirtle.name = "²¿ºÎ±â";
//		squirtle.type = "¹°";
//		squirtle.hp = 200;
//		squirtle.damage = 120;
//		squirtle.defensive = 100;
//		squirtle.speed = 50;
//		squirtle.state = true;
//		pokemon[1] = squirtle;

		System.out.println("======== Æ÷ÄÏ¸ó ¹èÆ² ========");

		if (pokemon[0].speed > pokemon[1].speed) {
			while(true) {
				if(pikachu.state==false) {
					System.out.println("²¿ºÎ±âÀÇ ½Â¸®");
					break;
				} else if(squirtle.state==false) {
					System.out.println("ÇÇÄ«ÃòÀÇ ½Â¸®");
					break;
				}
				
				System.out.println(pikachu.name+"ÀÇ °ø°ÝÂ÷·Ê!!");
				squirtle.hp += squirtle.defensive - pikachu.attack();
				System.out.println(squirtle.name + "Ã¼·Â : " + squirtle.hp);
				
				System.out.println(squirtle.name+"ÀÇ °ø°ÝÂ÷·Ê!!");
				pikachu.hp += pikachu.defensive - squirtle.attack();
				System.out.println(pikachu.name + "Ã¼·Â : " + pikachu.hp);
				
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
