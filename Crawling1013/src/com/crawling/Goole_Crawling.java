package com.crawling;

import java.io.IOException;

//import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Goole_Crawling {

	public static void main(String[] args) {
		try {
			//1. url 접근
			Document doc = Jsoup.connect("http://www.google.com").get();
			//text() : 웹 페이지 내의 텍스트만 추출
			System.out.println(doc.text());
			//select(CSS Selector) : 웹 페이지에서 원하는 태그 검색
			System.out.println(doc.select("._Gs").first());
			System.out.println(doc.select("._Gs").last());
			
			//2. 내가 추출하고자 하는 데이터 검색
			//Elements : ArrayList<Element> 형태로 태그가 저장
			Elements elements = doc.select("._Gs");
			
			System.out.println(elements.get(0).text());
			System.out.println(elements.get(3).text());
			
			//attr(Attrubute) : 해당 태그의 속성값 추출
			System.out.println(elements.get(0).attr("href"));
			
			//클래스명이 _Gs인 태그에 해당하는 Text와 링크주소 출력
			System.out.println();
			for (int i = 0; i < elements.size(); i++) {
				System.out.println(elements.get(i).text() + " : " + elements.get(i).attr("href"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
