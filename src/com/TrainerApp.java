package com;

public class TrainerApp {
	public static void main(String[] args) {
		Trainer t1 = new Trainer(123, null, null);		
	
	    System.out.println("Id = " + t1.id +  ",Name = " + t1.name + ", Subject = " + t1.subject);
		
		
		
		Trainer t2 = new Trainer(3456,"raj","skills");
		
		
		
		System.out.println("Id = "+t2.id + ",Name = " +t2.name + ", Subject = " +t2.subject);
	}

}
class Trainer { 
	int id;
	String name;
	String subject;
	Trainer (int a, String b, String c)
	{
		id = a;
		//name = b;
		//subject = c;
	}
	void tech()
	{
		System.out.println("stared teaching");
	}
	void TakeAttendence ()
	{
		System.out.println("Attendence teaken");
	}
	
}
