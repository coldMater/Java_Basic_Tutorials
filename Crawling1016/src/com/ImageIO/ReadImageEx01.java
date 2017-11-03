package com.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadImageEx01 {

	public static void main(String[] args) {
		//BufferedImage Ŭ���� : �̹����� �׸� �� �ְ� �޸� �� ��ȭ������ ������ ����
		BufferedImage img = null;
		
		File file = new File("C:\\Users\\pc-13\\Desktop\\image\\33333.jpg");
		
		try {
			//ImageIO Ŭ���� : �̹����� �аų� ���� ���� Ŭ����
			img = ImageIO.read(file);
			FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\12333.png");
			ImageIO.write(img, "png", out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
