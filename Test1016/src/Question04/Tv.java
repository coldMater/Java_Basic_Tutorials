package Question04;

public class Tv {

	public int channel;
	public String color;
	
	public void print() {
		System.out.println("Tv�� ���� ä���� : " + channel + "�̰�, Tv�� ������ " + color + " �Դϴ�.");
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

}
