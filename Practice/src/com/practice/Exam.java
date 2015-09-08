package com.practice;



public class Exam {
 private	int a;
	Exam() {
		a =1220;
	}
	Exam(int i)
	{
		a=i;
	}


public static void main(String args[]) throws CloneNotSupportedException
{
	
	Exam exam = new Exam();
	System.out.println(exam.a);
	
	Exam exm = new Exam(20);
	System.out.println(exm.a);
	System.out.println("oijklj");
	exam.clone().hashCode();
	System.out.println(exam.clone().toString());
}
}