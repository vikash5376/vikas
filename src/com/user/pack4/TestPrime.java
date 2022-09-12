package com.user.pack4;
import java.util.Scanner;
public class TestPrime 
{  
	public static void main(String[] args) 
	{
		int num1,num2,flag,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        if((num1<num2) && (num1>=2))
        {
        for( int i=num1;i<=num2;i++)
        {
        	flag=0;
        	for(int j=2;j<=i/2;j++)
        	{
        		if(i%j==0)
            	{
            		flag=1;
            		break;
            	}
        	}
        	if((num1==2)||(flag==0))
        	{
        	count++;
        	System.out.println(i);
        	}
        }
        }
        System.out.println("total number of prime number are "+count);
	}
}
