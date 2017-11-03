package com.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx01 {

	public static void main(String[] args) throws Exception {
		try {
			File file = new File("C:\\Users\\pc-13\\Desktop\\text.txt");
			System.out.println(file.exists());
			// 1. �Է� ��Ʈ�� ����
			FileReader reader = new FileReader(file);
			

			// 2.���� ���� ���� ����
			int ch = 0;

			while ((ch = reader.read()) != -1) { //(ch = reader.read()) != -1 -> ch�� �ƹ��� ���� ���� while�� ����
				System.out.print((char)ch);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
