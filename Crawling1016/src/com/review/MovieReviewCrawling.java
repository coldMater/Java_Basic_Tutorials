package com.review;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MovieReviewCrawling {

	public static void main(String[] args) {
		try {
			//1.Url 접근
			Document doc = Jsoup.connect("http://movie.naver.com/movie/bi/mi/point.nhn?code=161850").get();
			FileWriter writer = new FileWriter("C:\\Users\\pc-13\\Desktop\\review.txt");
			
			System.out.println(doc.select("#pointAfterListIframe").attr("src"));
			
			String reviewPageUrl = doc.select("#pointAfterListIframe").attr("src");
			
			Document reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl).get();
			
			//System.out.println(reviewPage.select(".score_reple > p"));
			
//			Elements reple = reviewPage.select(".score_reple > p");			
			
//			for (int i = 0; i < reple.size(); i++) {
//				System.out.println(reple.get(i).text());
//			}
			
			//replace(변경하고 싶은 문자열, 대체할 문자열);
			System.out.println(reviewPage.select(".sp + em").text().replace(",", ""));
			
			//Integer.parseInt() : 문자열을 정수형으로 변환
			int totalPage = Integer.parseInt(reviewPage.select(".sp + em").text().replace(",", "")) / 10;
			if(Integer.parseInt(reviewPage.select(".sp + em").text().replace(",", "")) % 10 != 0) {
				totalPage++;
			}
			
			//리뷰 페이지 접근
			for (int j = 1; j <= totalPage; j++) {
				reviewPage = Jsoup.connect("http://movie.naver.com" + reviewPageUrl + "&page="+j).get();
				Elements reple = reviewPage.select(".score_reple > p");			
				
				//영화 리뷰 수집
				for (int i = 0; i < reple.size(); i++) {
					System.out.println(reple.get(i).text().replace("BEST", "").replace("관람객", ""));
					writer.write(reple.get(i).text().replace("BEST", "").replace("관람객", "") + "\r\n");
				}
			}
			
			writer.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
