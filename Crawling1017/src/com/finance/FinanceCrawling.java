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

		File file = new File("C:\\Users\\pc-13\\Desktop\\����.xls");

		try {
			Document financePage = Jsoup.connect(url).get();
			
			// 1.�������ϻ���
			WritableWorkbook workbook = Workbook.createWorkbook(file);

			// 2.Sheet ����
			WritableSheet sheet = workbook.createSheet("finance", 0);

			// System.out.println(financePage.select(".box_type_m + iframe").attr("src"));

			Document iFrameUrl = Jsoup
					.connect("http://finance.naver.com" + financePage.select(".box_type_m + iframe").attr("src")).get();

			Elements titles = iFrameUrl.select("tr > th"); // ����
			Elements date = iFrameUrl.select(".date"); // ü��ð�
			Elements money = iFrameUrl.select(".number_1"); // ü�ᰡ, ������, �ŷ���, �ŷ����
			Elements rate_down = iFrameUrl.select(".rate_down"); // ���Ϻ�
			
			Label label = null;
			for (int i = 0; i < titles.size(); i++) {
				label = new Label(i, 0, titles.get(i).text());
				sheet.addCell(label);
			}

			System.out.println(titles.text());
			for (int i = 0; i < date.size(); i++) {
				System.out.print(date.get(i).text() + " "); // ü��ð�
				System.out.print(money.get(i * 4).text() + " "); // ü�ᰡ
				System.out.print(rate_down.text() + " "); // ���Ϻ�
				System.out.print(money.get((i * 4) + 1).text() + " "); // ������
				System.out.print(money.get((i * 4) + 2).text() + " "); // �ŷ���
				System.out.println(money.get((i * 4) + 3).text() + " "); // �ŷ����
				
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

			// �������� ����
			workbook.write();
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
