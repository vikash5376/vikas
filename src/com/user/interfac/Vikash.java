package com.user.interfac;

public class Vikash implements TestInterface,PreviousJobInfo
{

	@Override
	public void employeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("i am vikash kumar.");
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("my salary was 15lpa.");
		
	}

	@Override
	public void posistion() {
		// TODO Auto-generated method stub
		System.out.println("my posistion was java developer");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("i am vikash kumar.");
		
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("my age is 22years");
		
	}

	@Override
	public void gender() {
		// TODO Auto-generated method stub
		System.out.println("my gender is male");
		
	}

	@Override
	public void dob() {
		// TODO Auto-generated method stub
		System.out.println("my dob is 27-9-97");
		
	}
	public static void main(String[] args) {
		Vikash v=new Vikash();
		v.name();
	}
	

}
