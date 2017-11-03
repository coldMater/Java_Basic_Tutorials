package Tongue_Twister;

import java.util.ArrayList;
import java.util.Random;

public class TongueManager {
	private ArrayList<String> list = new ArrayList<String>();
	private Random rd = new Random();
	private int index;
	public final int count;
	
	public TongueManager() {
		this(3);
	}
	
	public TongueManager(int count) {
		this.count = count;
		list.add("����û öâ���� �� öâ���̳� ö öâ���̳�");
		list.add("���� ��� ������ �� ���йڻ��̽ð� ���� ��� �̺��� �� ���йڻ��̽ô�");
		list.add("�츮 �� ���� ���� ��â���� ���â���̰�,�츮�� ���� ���� ��â���� ����â���̴�");
		list.add("���� ������ ���� �����̰�, ���� ������ ���� �����̴�");
		list.add("����Ư���� Ư���㰡�� �㰡���� �����");
		list.add("�ѱ��������� ������ ��������");
		list.add("��� �ξ� �� �ξ�");
		list.add("ö�� å�� ö å��");
		list.add("���� ���� �� ����簡 �� �� ������ �� �� ������");
		list.add("�۳⿡ �� ������� �� ������̰�, �ݳ⿡ �� ������� �� ������̴�");
		list.add("���� �� ��Ʋ�� ���� �� ��Ʋ�ΰ� ���� �� �� ��Ʋ�ΰ�?");
		list.add("����� ������ ��� �����̰� ����� ������ ��� ������ ����ߴ�");
		list.add("���� ���� �������� �� �������̰� ���� ���� �������� �� �������̴�");
		list.add("�װ� �׸� �⸰ �׸��� �� �׸� �⸰ �׸��̰� ���� �׸� �⸰ �׸��� �� �׸� �⸰ �׸��̴�");
		list.add("The sixth sick sheikh's sixth sheep's sick");
	}

	private void makeRandom() {
		index = rd.nextInt(list.size());
	}
	
	public String getGameMSG() {
		makeRandom();
		return list.get(index);
	}

	public boolean check(String tongue) {
		return (list.get(index).equals(tongue));
	}
}
