package com.ImageIO;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ReadImageEx02 {

	public static void main(String[] args) {
		BufferedImage img = null;
		try {
			URL imgUrl = new URL("https://s.pstatic.net/static/www/img/2017/sp_main_v170926.png");
			
			img = ImageIO.read(imgUrl);
			
			FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\naver.png");
			
			//ImageIO.write(저장할 이미지, 저장할 확장자, 저장할 위치)
			ImageIO.write(img, "png", out);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
