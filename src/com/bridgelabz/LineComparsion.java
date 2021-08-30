package com.bridgelabz;

import java.util.Scanner;

public class LineComparsion {
	Scanner reader=new Scanner(System.in);
int x1,x2,y1,y2;
public void length()
{
	System.out.println("enter first point:");
	x1=reader.nextInt();
	y1=reader.nextInt();
	System.out.println("enter secound point:");
	x2=reader.nextInt();
	y2=reader.nextInt();
	double LengthofaLine=Math.sqrt( ((x2 - x1)^2)+((y2-y1)^2));
	System.out.println("length is"+LengthofaLine);
	}
	public static void main(String[] args) {
		
		LineComparsion obj=new LineComparsion();
		obj.length();
		

	}

}
