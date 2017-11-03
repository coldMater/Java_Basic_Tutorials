package com.WriteJXL;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWritePractice02 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\2017년_급여현황.xls");
		String[][] salary = {{"부서", "성명", "직위", "급여"}, 
									{"영업부", "이수진", "대리", "1500000"},
									{"사업부", "박참봉", "과장", "2150000"},
									{"개발부", "김무봉", "부장", "2700000"},
									{"기획부", "마진혁", "사원", "1200000"},
									{"경리부", "진소라", "대리", "1500000"},
									{"행정부", "이시후", "사원", "1200000"}};
		
		try {
			//1.엑셀파일생성
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			
			//2.Sheet 생성
			WritableSheet sheet = workbook.createSheet("Salary", 0);
			
			for (int i = 0; i < salary.length; i++) {
				for (int j = 0; j < salary[i].length; j++) {
					Label label = new Label(j, i, salary[i][j]);
					sheet.addCell(label);
				}
			}
			
			//엑셀파일 저장
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
