package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class Learn2 {
	public static void main(String[] args) throws IOException 
	{
/*	    try
	    {
	    File file = new File("D:/java/A/abc.txt");
	    file.mkdirs();
	    //file.createNewFile();
	    System.out.println(file+"______created");
	    file.createNewFile();
	    }
	    catch(Exception e)
	    {
	        System.out.println("ecception");
//	    */
	//	}
	    String path = "D:"+File.separator+"hello"+File.separator+"hi.txt" + "&" +"hello.txt" ;
	    String path1 = "D:"+File.separator+"hello"+File.separator+"hello1.txt" ;
	    String path2 = "D:"+File.separator+"hello"+File.separator+"hello2.txt" ;
	    String path3 = "D:"+File.separator+"hello"+File.separator+"hello3.txt" ;
	    String path4 = "D:"+File.separator+"hello"+File.separator+"hello4.txt" ;
	    
	  
	    //(use relative path for Unix systems)
	    
	  File f = new File(path);
	  //(works for both Windows and Linux)
	  
	  f.getParentFile().mkdirs(); 
	  f.createNewFile();
	  System.out.println("this also created");
	  
	  String content = "heloow tho tghaoldi e dkadft aldr"; 
	  FileWriter fw = new FileWriter(f.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
	
	  File f1 = new File(path1);
	  //(works for both Windows and Linux)
	  f1.getParentFile().mkdirs(); 
	  f1.createNewFile();
	  System.out.println("this also created");

	
File f2 = new File(path2);
//(works for both Windows and Linux)
f2.getParentFile().mkdirs(); 
f2.createNewFile();
System.out.println("this also created");


File f3 = new File(path3);
//(works for both Windows and Linux)
f3.getParentFile().mkdirs(); 
f3.createNewFile();
System.out.println("this also created");


BufferedReader br = new BufferedReader(null);
br.readLine();



}

	}


