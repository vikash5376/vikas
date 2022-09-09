package com.user.pack4;
import java.util.Scanner;
public class Arrayp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Enter the values:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Output");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
