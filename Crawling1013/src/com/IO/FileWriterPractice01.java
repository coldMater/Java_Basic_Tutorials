package com.IO;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class FileWriterPractice01 {

	public static void main(String[] args) {
		try {
			//1.url 접근
			Document doc = Jsoup.connect("http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=277&aid=0004093281").get();
			
			//2.찾고자 하는 태그를 검색
			Elements elements = doc.select("#articleBodyContents");
			
			//3.문자변환
			String[] p = elements.get(0).text().split("\\."); //.을 기준으로 나눠짐
			
			//4.파일 저장
			FileWriter fileWriter = new FileWriter("C:\\Users\\pc-13\\Desktop\\news.txt");
			
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
				fileWriter.write(p[i] + "\r\n"); //텍스트내에서 줄바꿈 \r\n
			}
			
			fileWriter.close();
			
//			FileWriter fileWriter = new FileWriter("C:\\Users\\pc-13\\Desktop\\news.txt");
//			Document doc = Jsoup.connect("http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=277&aid=0004093281").get();
//			
//			Elements elements = doc.select("#articleBodyContents");
//			
//			String[] p = elements.get(0).text().split("\\.");
//			
//			for (int i = 0; i < p.length; i++) {
//				System.out.println(p[i]);
//				fileWriter.write(p[i] + "\r\n"); //텍스트내에서 줄바꿈 \r\n
//			}
//			
//			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
