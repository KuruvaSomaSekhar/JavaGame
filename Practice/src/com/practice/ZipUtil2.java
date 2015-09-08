package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipUtil2 {
	
public	List<String > listString = new ArrayList<String>();
public final static String  outPath = "";
	
	static File filePath = new File("");
	public final static String sourcePath = "";
	public ZipUtil2()
	{
		listString = new ArrayList<String>();
	}
public static void main(String[] args) {
	ZipUtil2 zipUtil = new ZipUtil2();
	zipUtil.generateFIleLIst(new File(sourcePath));
	zipUtil.zipIt(outPath);
	
}


private void zipIt(String outPath) {
	Byte buffer = new Byte((byte) 1024);
	String source= "";
	FileOutputStream fos= null;
	ZipOutputStream zos = null;
	try {
		
		source = (String) sourcePath.subSequence(sourcePath.lastIndexOf("\\")+1, sourcePath.length());
	} catch (Exception e) {
		source = sourcePath;
	}
	try {
		fos = new FileOutputStream(outPath);
		zos = new ZipOutputStream(fos);
		System.out.println("out put path"+outPath);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	for (String files:this.listString )
	{
		
	}
}
private void generateFIleLIst(File file) {
	
	
}

}
