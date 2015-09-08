package com.practice;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strams {

	public static void main(String[] args) throws IOException {
		

	
	File file = new File("D:\\eclipse-jee-luna-SR2-win32-x86_64 (1)\\eclipse\\artifacts.xml");
 
			String line = null;
		
			 BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			 
			  List<String> records = new ArrayList<String>();
				// use the readLine method of the BufferedReader to read one line at a time.
			    // the readLine method returns null when there is nothing else to read.
			    while ((line = bufferedReader.readLine()) != null)
			    {
			        records.add(line);
			      //  System.out.println(records);
			    }
			   
			    // close the BufferedReader when we're done
			    bufferedReader.close();
			   System.out.print(records);
			   
			   PrintWriter out = new PrintWriter("D:\\eclipse-jee-luna-SR2-win32-x86_64 (1)\\eclipse\\output.txt");
			   out.println(records);
			 
			   PrintStream pst = new PrintStream( new FileOutputStream("D:\\eclipse-jee-luna-SR2-win32-x86_64 (1)\\eclipse\\outppput.txt"));
			System.setOut(pst);   
			  
			   
			
	//stream.close();
//	System.out.printlin(isTrue + " " + value);
	System.out.println();
	
	}
}
