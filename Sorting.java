package com.practice;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
	
		List ary = new ArrayList();
		int[] a = {2,3,5,6,7,22,1, 55, 90, 200};
		ary.add(a);
		int large=0;
		int small = a[0];
		
		List b = Arrays.asList(a);
		Collections.max(b);
		 mymethod();
		
		System.out.println(Collections.max(b));
for (int i = 0; i < a.length; i++) {
	
	Collections.max(ary);
	
	
	if (a[i]>large)
	{
		large = a[i];
	} else if (a[i]<small) {
		
		
		small= a[i];
}
}
		System.out.println("large numkber     "+large );
		System.out.println("smal      "+small);
		
	}
	private static void mymethod() {
		Integer[] arr = {33, 34, 112, 14, 23};
  //      List&lt;Integer&gt;
        List<Integer> b = Arrays.asList(arr);
        System.out.println(Collections.max(b));
		
	}
	


}
