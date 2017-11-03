package com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\pc-13\\Desktop\\word.txt");
			
			fileWriter.write("æ»≥Á«œººø‰. π›∞©Ω¿¥œ¥Ÿ.");
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
