package com.WriteJXL;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWritePractice02 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\2017��_�޿���Ȳ.xls");
		String[][] salary = {{"�μ�", "����", "����", "�޿�"}, 
									{"������", "�̼���", "�븮", "1500000"},
									{"�����", "������", "����", "2150000"},
									{"���ߺ�", "�蹫��", "����", "2700000"},
									{"��ȹ��", "������", "���", "1200000"},
									{"�渮��", "���Ҷ�", "�븮", "1500000"},
									{"������", "�̽���", "���", "1200000"}};
		
		try {
			//1.�������ϻ���
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			
			//2.Sheet ����
			WritableSheet sheet = workbook.createSheet("Salary", 0);
			
			for (int i = 0; i < salary.length; i++) {
				for (int j = 0; j < salary[i].length; j++) {
					Label label = new Label(j, i, salary[i][j]);
					sheet.addCell(label);
				}
			}
			
			//�������� ����
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
