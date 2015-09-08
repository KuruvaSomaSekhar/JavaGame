package com.practice;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		File path = new File("D:/Wite");
		path.canExecute();
		path.canRead();
		path.canWrite();
		path.mkdirs();
		path.createTempFile("abc", ".txt", path);
	FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream fds = new DataOutputStream(fos);
		fds.writeChars("hellow tho this");
		System.out.println(path);
	}
}
