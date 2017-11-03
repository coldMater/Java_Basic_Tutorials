package DollDrawing;

import java.util.ArrayList;
import java.util.Random;

public class DollMain {

	public static void main(String[] args) {
		Doll pikachu = new PikachuDoll();
		Doll pairi = new CharmanderDoll();
		Doll ppippi = new ClefairyDoll();
		Doll Isanghacci = new BulbasaurDoll();

		ArrayList<Doll> doll = new ArrayList<Doll>();
		doll.add(ppippi);
		doll.add(pairi);
		doll.add(pikachu);
		doll.add(Isanghacci);
		doll.add(new DragoniteDoll());
		doll.add(new DittoDoll());
		
		autoMachine(doll);
		//input -> ��������(ArrayList) / �ϴ� �� -> �����̱�(print ȣ���ϱ�) / output -> X
	}

	private static void autoMachine(ArrayList<Doll> doll) {
		Random rd = new Random();
		
		int num = rd.nextInt(doll.size());
		
		doll.get(num).print();
	}

}
