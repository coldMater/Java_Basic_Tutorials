package com.finance;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class FinanceCrawling {

	public static void main(String[] args) {
		String url = "http://finance.naver.com/sise/sise_index.nhn?code=KOSPI";

		File file = new File("C:\\Users\\pc-13\\Desktop\\증권.xls");

		try {
			Document financePage = Jsoup.connect(url).get();
			
			// 1.엑셀파일생성
			WritableWorkbook workbook = Workbook.createWorkbook(file);

			// 2.Sheet 생성
			WritableSheet sheet = workbook.createSheet("finance", 0);

			// System.out.println(financePage.select(".box_type_m + iframe").attr("src"));

			Document iFrameUrl = Jsoup
					.connect("http://finance.naver.com" + financePage.select(".box_type_m + iframe").attr("src")).get();

			Elements titles = iFrameUrl.select("tr > th"); // 제목
			Elements date = iFrameUrl.select(".date"); // 체결시각
			Elements money = iFrameUrl.select(".number_1"); // 체결가, 변동량, 거래량, 거래대금
			Elements rate_down = iFrameUrl.select(".rate_down"); // 전일비
			
			Label label = null;
			for (int i = 0; i < titles.size(); i++) {
				label = new Label(i, 0, titles.get(i).text());
				sheet.addCell(label);
			}

			System.out.println(titles.text());
			for (int i = 0; i < date.size(); i++) {
				System.out.print(date.get(i).text() + " "); // 체결시각
				System.out.print(money.get(i * 4).text() + " "); // 체결가
				System.out.print(rate_down.text() + " "); // 전일비
				System.out.print(money.get((i * 4) + 1).text() + " "); // 변동량
				System.out.print(money.get((i * 4) + 2).text() + " "); // 거래량
				System.out.println(money.get((i * 4) + 3).text() + " "); // 거래대금
				
				label = new Label(0, i + 1, date.get(i).text());
				sheet.addCell(label);
				label = new Label(1, i + 1, money.get(i * 4).text());
				sheet.addCell(label);
				label = new Label(2, i + 1, rate_down.text());
				sheet.addCell(label);
				label = new Label(3, i + 1, money.get((i * 4) + 1).text());
				sheet.addCell(label);
				label = new Label(4, i + 1, money.get((i * 4) + 2).text());
				sheet.addCell(label);
				label = new Label(5, i + 1, money.get((i * 4) + 3).text());
				sheet.addCell(label);
			}

			// 엑셀파일 저장
			workbook.write();
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
