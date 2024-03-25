package com.jspider.filehandling.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/file/Demo.txt");
		if (file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("java is programming language.");
			System.out.println("Data is successfully written!");
			fileWriter.close();
		} else {
			boolean status = file.createNewFile();
			if (status) {
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write("java is programming language.");
				System.out.println("Data is successfully written!");
				fileWriter.close();
			} else {
				System.out.println("file is not created!");
			}
		}
	}
}
