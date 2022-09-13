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
        	int i=num1;
        while( i<=num2)
        {
        	flag=0;
        	int j=2;
        	while(j<=i/2)
        	{
        		if(i%j==0)
            	{
            		flag=1;
            		break;
            	}
        		j++;
        	}
        	if((num1==2)||(flag==0))
        	{
        	count++;
        	System.out.println(i);
        	}
        	i++;
        }
        }
        System.out.println("total number of prime number are "+count);
	}
}
