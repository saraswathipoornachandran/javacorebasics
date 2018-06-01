package com.basic;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
	area radi = new area();
     radi.multi();
	}

}
class area{
private float l,b;
public void multi()
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the value of l and b");
	l=in.nextInt();
	b=in.nextInt();
	if((l>0 && l<20.0)&&(b>0 && b<20.0))
	{
		System.out.println("area of rectangle"+l*b);
		System.out.println("perimeter of rectangle"+2*(l*b));
	}else
	{
		System.out.println("larger value");
	}
	
}
	
	
}