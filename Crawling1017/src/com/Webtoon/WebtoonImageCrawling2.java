package com.Webtoon;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebtoonImageCrawling2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("웹툰제목 : ");
		String wtName = sc.next();
		System.out.print("시작화 : ");
		int startNo = sc.nextInt();
		System.out.print("끝화 : ");
		int endNo = sc.nextInt();

		String wtUrl = "http://comic.naver.com/webtoon/detail.nhn?titleId=131385&no=";

		try {
			for (int n = startNo; n <= endNo; n++) {

				Document webtoonPage = Jsoup.connect(wtUrl + n).get();

				// System.out.println(webtoonPage.select(".wt_viewer > img"));

				Elements imgUrl = webtoonPage.select(".wt_viewer > img");
				
				for (int i = 0; i < imgUrl.size(); i++) {
					System.out.println(imgUrl.get(i).attr("src"));
					String src = imgUrl.get(i).attr("src");

					URL url = new URL(src);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();

					conn.setRequestProperty("Referer", src);
					BufferedImage img = ImageIO.read(conn.getInputStream());

					FileOutputStream out = new FileOutputStream("C:\\Users\\pc-13\\Desktop\\image\\webtoon\\" + wtName + "_" + n + "_" + (i + 1) + ".jpg");
					ImageIO.write(img, "jpg", out);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
