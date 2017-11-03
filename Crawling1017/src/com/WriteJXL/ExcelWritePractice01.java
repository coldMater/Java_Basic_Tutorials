package com.WriteJXL;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWritePractice01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\practice.xls");
		try {
			//1.竣伎颇老积己
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			
			//2.Sheet 积己
			WritableSheet sheet = workbook.createSheet("Sheet1", 0);
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					Label label = new Label(j, i, i + "" + j);
					sheet.addCell(label);
				}
			}			
			
			//竣伎颇老 历厘
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
