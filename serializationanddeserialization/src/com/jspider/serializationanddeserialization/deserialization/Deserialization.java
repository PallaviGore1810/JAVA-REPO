package com.jspider.serializationanddeserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspider.serializationanddeserialization.object.User;

public class Deserialization {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
	File file=new File("D:/file/Demo.txt");
	FileInputStream fileInputStream= new FileInputStream(file);                              
	ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
	User user=(User) (objectInputStream.readObject());
	System.out.println(user);
	System.out.println("Object is deserialized!");
	objectInputStream.close();
	fileInputStream.close();
	}
	
}
