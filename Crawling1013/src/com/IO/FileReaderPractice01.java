package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPractice01 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Windows\\system.ini");

			System.out.println(file.exists()); // ���� ���翩��

			if (!file.exists()) {
				file.createNewFile(); // ���ο� ���� ����
			}
			// 1. �Է� ��Ʈ�� ����
			FileReader reader = new FileReader(file);

			// 2.���� ���� ���� ����
			int ch = 0;

			while ((ch = reader.read()) != -1) { // (ch = reader.read()) != -1 -> ch�� �ƹ��� ���� ���� while�� ����
				System.out.print((char) ch);
			}
			
			System.out.println(file.getAbsolutePath());//���� ���� ���
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
