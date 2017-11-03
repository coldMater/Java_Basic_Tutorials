package com.ImageIO;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ReadImageEx03 {

	public static void main(String[] args) {
		BufferedImage img = null;
		HttpURLConnection conn = null;
		String wtUrl = "http://imgcomic.naver.net/webtoon/183559/353/20171012190429_c14ff1ec39abbebca71610eafb4cd819_IMAG01_1.jpg";
		try {
			URL imgUrl = new URL(wtUrl);
			conn = (HttpURLConnection) imgUrl.openConnection();
			
			conn.setRequestProperty("Referer", wtUrl);

			img = ImageIO.read(conn.getInputStream());

			FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\IMAG01_1.png");

			// ImageIO.write(저장할 이미지, 저장할 확장자, 저장할 위치)
			ImageIO.write(img, "png", out);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
