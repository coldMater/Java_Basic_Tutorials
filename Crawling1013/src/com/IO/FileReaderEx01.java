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
			// 1. 입력 스트림 생성
			FileReader reader = new FileReader(file);
			

			// 2.문자 저장 변수 생성
			int ch = 0;

			while ((ch = reader.read()) != -1) { //(ch = reader.read()) != -1 -> ch에 아무런 값이 들어가면 while문 종료
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
