package Fundamental;

import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		String str=new String();
		str=s.next();
		char c=str.charAt(0);
		int m1,m2,m3;
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(c);
		System.out.println(avg);
	}
}
