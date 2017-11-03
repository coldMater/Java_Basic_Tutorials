package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// �޴� ���(), ������� ���()
		ArrayList<MusicVO> playlist = new ArrayList<MusicVO>();
		playlist.add(new MusicVO("����", "���", 100, "D:\\KSH\\music\\bangbangbang.mp3"));
		playlist.add(new MusicVO("������", "��ũ������", 120, "D:\\KSH\\music\\brothercar.mp3"));
		playlist.add(new MusicVO("cheerup", "Ʈ���̽�", 143, "D:\\KSH\\music\\cheerup.mp3"));
		playlist.add(new MusicVO("daddy", "����", 190, "D:\\KSH\\music\\daddy.mp3"));
		playlist.add(new MusicVO("dumbdumb", "���座��", 110, "D:\\KSH\\music\\dumbdumb.mp3"));
		playlist.add(new MusicVO("��������", "����ģ��", 170, "D:\\KSH\\music\\glass.mp3"));
		playlist.add(new MusicVO("IcecreamCake", "���座��", 110, "D:\\KSH\\music\\icecreamcake.mp3"));
		playlist.add(new MusicVO("�̷��Ÿ�׷�������", "��ƿ�", 90, "D:\\KSH\\music\\no.mp3"));
		playlist.add(new MusicVO("���Ʒ�", "EXID", 110, "D:\\KSH\\music\\updown.mp3"));
		playlist.add(new MusicVO("uptownpuck", "���븶��", 90, "D:\\KSH\\music\\uptownpunk.mp3"));

		MusicPlayer mp = new MusicPlayer(playlist);
		boolean onOff = true;

		while (onOff) {
			System.out.println("[1]���  [2]����  [3]������  [4]������  [5]����");
			switch (new Scanner(System.in).nextInt()) {
			case 1:
				MusicVO currentMusic = mp.play();
				System.out.println(currentMusic.getTitle());
				break;
			case 2:
				mp.stop();
				System.out.println("����");
				break;
			case 3:
				MusicVO previouMusic = mp.previous();
				System.out.println(previouMusic.getTitle());
				break;
			case 4:
				MusicVO nextMusic = mp.next();
				System.out.println(nextMusic.getTitle());
				break;
			case 5:
				System.out.println("����");
				onOff = false;
				break;
			}

		}
	}

}
