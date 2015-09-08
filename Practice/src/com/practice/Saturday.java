package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Saturday {
	public static void main(String[] args) throws IOException
    {	
		File path = new File("D:/Saturday");

		//File file = new File("D:/Saturday/A.txt");
		File file = new File(path+path.separator+"file.txt");
	if (!file.exists()) {
		
		file.getParentFile().mkdirs();
		file.createNewFile();
		System.out.println("created");
	}
 
//	String path= file.getAbsolutePath();
//	System.out.println(path);
//	String filelist;

	
File[] a=path.listFiles();
for (int i = 0; i < a.length; i++) {
//	System.out.println(a[i].toString().substring(12));
	
	List list = new ArrayList();
	
	
	
	list.add(a[i].toString().substring(12));
	Collections.sort(list);;
	Collection coll = new ArrayList();
	
	
	
	System.out.println(list);
	

			
	
}


 
    }

}
