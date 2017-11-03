package com.Webtoon;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebtoonImageCrawling {

	public static void main(String[] args) {
		String wtUrl = "http://comic.naver.com/webtoon/detail.nhn?titleId=183559&no=353&weekday=mon";
		
		try {
			Document webtoonPage = Jsoup.connect(wtUrl).get();
			
			//System.out.println(webtoonPage.select(".wt_viewer > img"));
			
			Elements imgUrl = webtoonPage.select(".wt_viewer > img");
			
			for (int i = 0; i < imgUrl.size(); i++) {
				System.out.println(imgUrl.get(i).attr("src"));
				String src = imgUrl.get(i).attr("src");
				
				URL url = new URL(src);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				
				conn.setRequestProperty("Referer", src);
				BufferedImage img = ImageIO.read(conn.getInputStream());
				
				FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\webtoon\\IMAG01_" + (i + 1) + ".jpg");
				ImageIO.write(img, "jpg", out);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
