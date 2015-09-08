package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Saturday2 {
	public static void main(String[] args) throws IOException {
		
		File path = new File("D:/Saturday2");
path.mkdir();

path.createTempFile("abc", ".tem");
path.createTempFile("ABC", ".txt");

path.createTempFile("adfsdf", ".pdf", path);
path.createTempFile("xyz", ".txt", path);

List list = new ArrayList();


	

		
	}

}
