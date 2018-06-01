package com.basic;

import java.util.Scanner;

public class oops {

	public static void main(String[] args) {
	
fun o=new fun();
o.add();
	}
}
class fun{
	private int a,b;
	public void add()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a=in.nextInt();
		a=in.nextInt();
		System.out.println("total number"+a+b);
	}
}