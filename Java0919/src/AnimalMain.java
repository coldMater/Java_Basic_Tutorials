
public class AnimalMain {

	public static void main(String[] args) {
		Animal lion = new Animal();
		Animal dog = new Animal();
		Animal elephant = new Animal();
		
		lion.name = "����";
		lion.leg = 4;
		lion.kg = 150;
		lion.eat = "���";
		lion.speed = 60;
		lion.cry = "��ƾƾ�";
		
		lion.eating();
		lion.run();
		lion.animalCry();
		
		dog.name = "��";
		dog.leg = 4;
		dog.kg = 20;
		dog.eat = "���";
		dog.speed = 50;
		dog.cry = "�۸�";
		
		elephant.name = "�ڳ���";
		elephant.leg = 4;
		elephant.kg = 1500;
		elephant.eat = "Ǯ";
		elephant.speed = 40;
		elephant.cry = "�ѿ���";
		
		System.out.print("���� ������ �ձ��� �����ϴ� ������ ������ : ");
		
		Animal[] animalInfo = new Animal[3];
		animalInfo[0] = lion;
		animalInfo[1] = elephant;
		animalInfo[2] = dog;
		
		for(int i = 0; i < animalInfo.length-1; i++) {
			System.out.print(animalInfo[i].name + ", ");
		}
		System.out.println(animalInfo[animalInfo.length-1].name + "�� �ֽ��ϴ�.");
	}

}
