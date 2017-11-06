package com.ReadJXL;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelRead {

	public static void main(String[] args) {
		//1.¿¢¼¿ÆÄÀÏÀÐ¾î¿À±â
		
		File file = new File("C:\\Users\\pc-13\\Desktop\\practice.xls");
		try {
			Workbook workbook = Workbook.getWorkbook(file);
			
			Sheet sheet = workbook.getSheet(0);
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					Cell cell = sheet.getCell(j, i);
					
					System.out.print(cell.getContents() + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
