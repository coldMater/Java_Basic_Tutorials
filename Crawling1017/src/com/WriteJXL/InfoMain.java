package com.WriteJXL;

import java.io.File;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class InfoMain {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\2017년_급여현황.xls");

		try {
			// 1.엑셀파일생성
			WritableWorkbook workbook = Workbook.createWorkbook(file);

			// 2.Sheet 생성
			WritableSheet sheet = workbook.createSheet("Salary", 0);

			String[] arr = { "부서", "이름", "직위", "급여" };

			ArrayList<Info> list = new ArrayList<Info>();
			list.add(new Info("영업부", "이수진", "대리", "1500000"));
			list.add(new Info("사업부", "박참봉", "과장", "2150000"));
			list.add(new Info("개발부", "김무봉", "부장", "2700000"));
			list.add(new Info("기획부", "마진혁", "사원", "1200000"));
			list.add(new Info("경리부", "진소라", "대리", "1500000"));
			list.add(new Info("행정부", "이시후", "사원", "1200000"));

			Label label = null;
			for (int i = 0; i < arr.length; i++) {
				label = new Label(i, 0, arr[i]);
				sheet.addCell(label);
			}
			
			for (int i = 0; i < list.size(); i++) {
				for (int j = 0; j < arr.length; j++) {
					switch (j) {
					case 0:
						label = new Label(j, i+1, list.get(i).getDepartment());
						sheet.addCell(label);
						break;
					case 1:
						label = new Label(j, i+1, list.get(i).getName());
						sheet.addCell(label);
						break;
					case 2:
						label = new Label(j, i+1, list.get(i).getLevel());
						sheet.addCell(label);
						break;
					case 3:
						label = new Label(j, i+1, list.get(i).getSalary());
						sheet.addCell(label);
						break;
					}
				}
			}

			// 엑셀파일 저장
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
