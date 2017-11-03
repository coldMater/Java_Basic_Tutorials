package Animal;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new Dog();
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].eat();
		}
	}

}
