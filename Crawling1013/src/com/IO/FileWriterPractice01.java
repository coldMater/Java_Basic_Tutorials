package com.IO;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class FileWriterPractice01 {

	public static void main(String[] args) {
		try {
			//1.url ����
			Document doc = Jsoup.connect("http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=277&aid=0004093281").get();
			
			//2.ã���� �ϴ� �±׸� �˻�
			Elements elements = doc.select("#articleBodyContents");
			
			//3.���ں�ȯ
			String[] p = elements.get(0).text().split("\\."); //.�� �������� ������
			
			//4.���� ����
			FileWriter fileWriter = new FileWriter("C:\\Users\\pc-13\\Desktop\\news.txt");
			
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
				fileWriter.write(p[i] + "\r\n"); //�ؽ�Ʈ������ �ٹٲ� \r\n
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
//				fileWriter.write(p[i] + "\r\n"); //�ؽ�Ʈ������ �ٹٲ� \r\n
//			}
//			
//			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
