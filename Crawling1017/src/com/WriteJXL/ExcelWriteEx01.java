package com.WriteJXL;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWriteEx01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\test.xls");
		try {
			//1.엑셀파일생성
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			
			//2.Sheet 생성
			WritableSheet sheet = workbook.createSheet("Sheet1", 0);
			
			//3.cell에 들어갈 데이터를 생성 -> Label(열, 행, 데이터)
			Label label = new Label(0, 0, "(0,0)");
			
			//4.cell에 저장
			sheet.addCell(label);
			
			label = new Label(2, 3, "(2,3)");
			sheet.addCell(label);
			
			sheet = workbook.createSheet("Sheet2", 1);
			label = new Label(2, 3, "(2,3)");
			sheet.addCell(label);
			
			
			//엑셀파일 저장
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
