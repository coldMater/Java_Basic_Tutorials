package com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\pc-13\\Desktop\\word.txt");
			
			fileWriter.write("�ȳ��ϼ���. �ݰ����ϴ�.");
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
