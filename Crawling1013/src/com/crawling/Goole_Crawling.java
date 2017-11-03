package com.crawling;

import java.io.IOException;

//import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Goole_Crawling {

	public static void main(String[] args) {
		try {
			//1. url ����
			Document doc = Jsoup.connect("http://www.google.com").get();
			//text() : �� ������ ���� �ؽ�Ʈ�� ����
			System.out.println(doc.text());
			//select(CSS Selector) : �� ���������� ���ϴ� �±� �˻�
			System.out.println(doc.select("._Gs").first());
			System.out.println(doc.select("._Gs").last());
			
			//2. ���� �����ϰ��� �ϴ� ������ �˻�
			//Elements : ArrayList<Element> ���·� �±װ� ����
			Elements elements = doc.select("._Gs");
			
			System.out.println(elements.get(0).text());
			System.out.println(elements.get(3).text());
			
			//attr(Attrubute) : �ش� �±��� �Ӽ��� ����
			System.out.println(elements.get(0).attr("href"));
			
			//Ŭ�������� _Gs�� �±׿� �ش��ϴ� Text�� ��ũ�ּ� ���
			System.out.println();
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).text() + " : " + elements.get(i).attr("href"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
