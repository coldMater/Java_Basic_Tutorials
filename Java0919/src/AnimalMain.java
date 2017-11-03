
public class AnimalMain {

	public static void main(String[] args) {
		Animal lion = new Animal();
		Animal dog = new Animal();
		Animal elephant = new Animal();
		
		lion.name = "사자";
		lion.leg = 4;
		lion.kg = 150;
		lion.eat = "고기";
		lion.speed = 60;
		lion.cry = "쿠아아앙";
		
		lion.eating();
		lion.run();
		lion.animalCry();
		
		dog.name = "개";
		dog.leg = 4;
		dog.kg = 20;
		dog.eat = "사료";
		dog.speed = 50;
		dog.cry = "멍멍";
		
		elephant.name = "코끼리";
		elephant.leg = 4;
		elephant.kg = 1500;
		elephant.eat = "풀";
		elephant.speed = 40;
		elephant.cry = "뿌우우우";
		
		System.out.print("현재 동물의 왕국에 존재하는 동물의 종류는 : ");
		
		Animal[] animalInfo = new Animal[3];
		animalInfo[0] = lion;
		animalInfo[1] = elephant;
		animalInfo[2] = dog;
		
		for(int i = 0; i < animalInfo.length-1; i++) {
			System.out.print(animalInfo[i].name + ", ");
		}
		System.out.println(animalInfo[animalInfo.length-1].name + "가 있습니다.");
	}

}
