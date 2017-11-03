package com.WriteJXL;

import java.io.File;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class InfoMain {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\pc-13\\Desktop\\2017��_�޿���Ȳ.xls");

		try {
			// 1.�������ϻ���
			WritableWorkbook workbook = Workbook.createWorkbook(file);

			// 2.Sheet ����
			WritableSheet sheet = workbook.createSheet("Salary", 0);

			String[] arr = { "�μ�", "�̸�", "����", "�޿�" };

			ArrayList<Info> list = new ArrayList<Info>();
			list.add(new Info("������", "�̼���", "�븮", "1500000"));
			list.add(new Info("�����", "������", "����", "2150000"));
			list.add(new Info("���ߺ�", "�蹫��", "����", "2700000"));
			list.add(new Info("��ȹ��", "������", "���", "1200000"));
			list.add(new Info("�渮��", "���Ҷ�", "�븮", "1500000"));
			list.add(new Info("������", "�̽���", "���", "1200000"));

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

			// �������� ����
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
