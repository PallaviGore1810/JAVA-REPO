package com.jspider.serializationanddeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspider.serializationanddeserialization.object.User;

public class Serialization {
	public static void main(String[] args) throws IOException {
		File file=new File("D:/file/Demo.txt");
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new User(1, "Ram","ram@gmail.com",987654320));
		System.out.println("Object has been serialized!");
		objectOutputStream.close();
		fileOutputStream.close();
	}
}
