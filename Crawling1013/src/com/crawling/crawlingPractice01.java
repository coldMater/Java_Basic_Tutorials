package com.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class crawlingPractice01 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=025&aid=0002761738").get();
			
			Elements elements = doc.select("#articleBodyContents");
			
			String[] p = elements.get(0).text().split("\\.");
			
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
