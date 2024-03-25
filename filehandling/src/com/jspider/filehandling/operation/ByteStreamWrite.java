package com.jspider.filehandling.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/file/Demo.txt");
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(1244);
			System.out.println("Data is written in the file!");
		} else {
			Boolean status = file.createNewFile();
			if (status) {
				System.out.println("File is created!");
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				fileOutputStream.write(1244);
				System.out.println("Data is written in the file!");
				fileOutputStream.close();
			} else {
				System.out.println("File nis not created!");
			}
		}
	}
}
