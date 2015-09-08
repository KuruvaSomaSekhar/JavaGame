package com.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Learn {

	public static void main(String[] args) throws IOException {
		
		System.out.println("creatioon of folder");
		
		File file = new File("D:/Hellow/A/B");
		
		if (!file.exists()) {
		file.mkdirs();	
		
		
		System.out.println("done");
		System.out.println(file.getAbsolutePath());
		
		String path = file.getAbsolutePath();
		System.out.println(file.getName());
		String F1 = "AB.txt";		
	

		String content = "This is the content to write into file";

		File filetext = new File("D:/Hellow/A/B/filename.txt");

		// if file doesnt exists, then create it
		if (!filetext.exists()) {
		filetext.mkdirs();
		filetext.getParentFile().mkdirs();
		filetext.createNewFile();
		}

		FileWriter fw = new FileWriter(filetext.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
	//	bw.close();

		System.out.println("Done");
	
		}
		else 
		{
			System.out.println("Already existed");
			
		}
		System.out.println("multiple dirs");
		file.mkdirs();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canExecute());
		System.out.println("");
	}
	
}
