package com.user.assignment;
import java.util.Scanner;
public class RoomBooking
{
	int hLocate,fMember,view,hNo,adult,child;
	int[] age;
	float price;
	Scanner sc=new Scanner(System.in);
	public void location()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Locations for the Hotels are:\n1.Mumbai\n2.Shimla\n--------------------------Enter your choice here---------------------------\n");
		hLocate=sc.nextInt();
	}
	public void hName()
	{
		if(hLocate==1)
		{
		System.out.println("List of hotel available in "+hLocate+" are:\n");
		System.out.println("1.The Taj Mahal Tower\n2.The Orchid Hotel\n3.Trident Nariman Point\n4.Taj Santacruz ");
		RoomBooking rb=new RoomBooking();
		rb.custInfo();
        System.out.println("choose the any of the above option:");
        hNo=sc.nextInt();
        if(hNo==1)
        {
        	System.out.println("-----------------Welcome to The Taj Mahal Tower--------------");
        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
        	view=sc.nextInt();
        	if(view==1)
        	{
        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
        	    price=adult*500+child*200;
        	    System.out.println("The price required to book hotel is RS."+price);
        	}
        	else if(view==2)
        	{
        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
            	price=adult*500+child*200;
            	System.out.println("The price required to book hotel is RS."+price);
        	}
        	else
        	{
        		System.out.println("please enter the correct view!");
        	}
        }
        else if(hNo==2)
        {
        	System.out.println("-----------------Welcome to The Orchid Hotel-----------------");
        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
        	view=sc.nextInt();
        	if(view==1)
        	{
        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
        	    price=adult*500+child*200;
        	    System.out.println("The price required to book hotel is RS."+price);
        	}
        	else if(view==2)
        	{
        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
            	price=adult*500+child*200;
            	System.out.println("The price required to book hotel is RS."+price);
        	}
        	else
        	{
        		System.out.println("please enter the correct view!");
        	}
        }
        else if(hNo==3)
        {
        	System.out.println("------------------welcome to the Trident Nariman Point---------------------");
        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
        	view=sc.nextInt();
        	if(view==1)
        	{
        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
        	    price=adult*500+child*200;
        	    System.out.println("The price required to book hotel is RS."+price);
        	}
        	else if(view==2)
        	{
        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
            	price=adult*500+child*200;
            	System.out.println("The price required to book hotel is RS."+price);
        	}
        	else
        	{
        		System.out.println("please enter the correct view!");
        	}
        }
        else if(hNo==4)
        {
        	System.out.println("-----------------Welcome to The Taj Santacruz--------------");
        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
        	view=sc.nextInt();
        	if(view==1)
        	{
        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
        	    price=adult*500+child*200;
        	    System.out.println("The price required to book hotel is RS."+price);
        	}
        	else if(view==2)
        	{
        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
            	price=adult*500+child*200;
            	System.out.println("The price required to book hotel is RS."+price);
        	}
        	else
        	{
        		System.out.println("please enter the correct view!");
        	}
        }
        else
        {
        	System.out.println("Choose the correct available option!");
        }
		}
		else if(hLocate==2)
		{
			System.out.println("List of hotel available in "+hLocate+" are:\n");
			System.out.println("1.The Oberoi Cecil \n2.Treebo Trend Varuna Shimla \n3.Treebo Trend Maharaja \n4.Wildflower Hall\n ");
			System.out.println("choose the any of the above option:");
			hNo=sc.nextInt();
			if(hNo==1)
	        {
	        	System.out.println("-----------------Welcome to The Oberoi Cecil--------------");
	        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
	        	view=sc.nextInt();
	        	if(view==1)
	        	{
	        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	        	    price=adult*500+child*200;
	        	    System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else if(view==2)
	        	{
	        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	            	price=adult*500+child*200;
	            	System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else
	        	{
	        		System.out.println("please enter the correct view!");
	        	}
	        	
	        }
	        else if(hNo==2)
	        {
	        	System.out.println("-----------------Welcome to Treebo Trend Varuna Shimla-----------------");
	        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
	        	view=sc.nextInt();
	        	if(view==1)
	        	{
	        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	        	    price=adult*500+child*200;
	        	    System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else if(view==2)
	        	{
	        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	            	price=adult*500+child*200;
	            	System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else
	        	{
	        		System.out.println("please enter the correct view!");
	        	}
	        }
	        else if(hNo==3)
	        {
	        	System.out.println("------------------welcome to the Treebo Trend Maharaja---------------------");
	        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
	        	view=sc.nextInt();
	        	if(view==1)
	        	{
	        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	        	    price=adult*500+child*200;
	        	    System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else if(view==2)
	        	{
	        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	            	price=adult*500+child*200;
	            	System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else
	        	{
	        		System.out.println("please enter the correct view!");
	        	}
	        }
	        else if(hNo==4)
	        {
	        	System.out.println("-----------------Welcome to The Wildflower Hall-------------------");
	        	System.out.println("The available view are :\n1.Mountain view \n2.Pool view\nChoose one the view option:");
	        	view=sc.nextInt();
	        	if(view==1)
	        	{
	        	    System.out.println("for mountain view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	        	    price=adult*500+child*200;
	        	    System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else if(view==2)
	        	{
	        		System.out.println("for Pool view:\\nEach Room has 5 capacity (3 Adult and 2 Childern)\nThe cost for each adult is rs.500. and the cost of each childeren is rs.200");
	            	price=adult*500+child*200;
	            	System.out.println("The price required to book hotel is RS."+price);
	        	}
	        	else
	        	{
	        		System.out.println("please enter the correct view!");
	        	}
	        }
	        else
	        {
	        	System.out.println("Choose the correct available option!");
	        }
		}
		else
		{
			System.out.println("Please Enter the correct choice!");
		}
	}
	public void custInfo()
	{
		System.out.println("Enter the total number of family member:");
		fMember=sc.nextInt();
		age=new int[fMember];
		for(int i=0;i<fMember;i++)
		{
			age[i]=sc.nextInt();
		}
		for(int j=0;j<fMember;j++)
		{
		    if(age[j]>10)
		    {
		    	adult++;
		    }
		    else
		    {
		    	child++;
		    }
		}
	}
	public static void main(String[] args)
	{
		RoomBooking rb=new RoomBooking();
		rb.location();
		rb.hName();	
	}
}
