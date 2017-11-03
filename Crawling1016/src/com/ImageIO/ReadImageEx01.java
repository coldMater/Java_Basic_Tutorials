package com.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadImageEx01 {

	public static void main(String[] args) {
		//BufferedImage 클래스 : 이미지를 그릴 수 있게 메모리 상에 도화지같은 공간을 생성
		BufferedImage img = null;
		
		File file = new File("C:\\Users\\pc-13\\Desktop\\image\\33333.jpg");
		
		try {
			//ImageIO 클래스 : 이미지를 읽거나 쓰기 위한 클래스
			img = ImageIO.read(file);
			FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\12333.png");
			ImageIO.write(img, "png", out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
