package controller;

import java.util.Scanner;

import model.Student;

public class Control {
 Student s[];
 
 Scanner sc=new Scanner(System.in);
 int n=0,k=0,i;
 public Control()
 {
	 s=new Student[20];
 }
public void Insert() throws InterruptedException
{
	Loding();
	System.out.println("\nInsert Data ~");
	System.out.println("Enter The Number of Student:");
	n=Integer.parseInt(sc.nextLine());
	for(i=k;i<n+k;i++)
	{
	System.out.println(" Student-"+(i+1));
	System.out.println("Enter your Roll No : ");	
	int roll=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Your Name : ");
	String name=sc.nextLine();
	System.out.println("Enter Your Paper 1 Mark : ");
	double p1=Double.parseDouble(sc.nextLine());
	System.out.println("Enter Your Paper 2 Mark : ");
	double p2=Double.parseDouble(sc.nextLine());
	System.out.println("Enter Your Paper 3 Mark : ");
	double p3=Double.parseDouble(sc.nextLine());
	
	s[i]=new Student();
	s[i].setRoll(roll);
	s[i].setName(name);
	s[i].setP1(p1);
	s[i].setP2(p2);
	s[i].setP3(p3);
	System.out.println("...............................|");
	}
	k=n+k;
}
 
public void Show() 
{
	for(i=0;i<k;i++)
	{
    System.out.println("Show Data ~");
	System.out.println(" Student-"+(i+1));
	System.out.println(" Roll No: "+s[i].getRoll()+", Name : "+s[i].getName()+", Paper 1: "+s[i].getP1()
			+", Paper 2: "+s[i].getP2()+", Paper 3: "+s[i].getP3());
	double result=(s[i].getP1()+s[i].getP2()+s[i].getP3())/3;
	s[i].setResult(result);
	System.out.println(" Result : "+s[i].getResult());
	System.out.println("...............................|");

}
}
public void Update() throws InterruptedException
{
	int user=0;
	System.out.println("Enter Roll : ");
	int nroll=Integer.parseInt(sc.nextLine());
	 Loding(); 
	for(int i=0;i<k;i++)
	{
	if(nroll==s[i].getRoll())
	{
	System.out.println("\n1.Name");
	System.out.println("2.Result");
	System.out.println("0.Exit");
	
	System.out.println("Enter Your Choice : ");
	int ch=Integer.parseInt(sc.nextLine());
	
	switch(ch)
	{
	case 1:
		System.out.println("Old Name : "+s[i].getName());
		System.out.println("Enter Update Name : ");
		String name=sc.nextLine();
		s[i].setName(name);
		update();
		break;
	case 2:
		System.out.println("1.Paper 1");
		System.out.println("2.Paper 2");
		System.out.println("3.Paper 3");
		
		System.out.println("Enter Your Choice : ");
		int ch1=Integer.parseInt(sc.nextLine());
		switch(ch1)
		{
		case 1:
			System.out.println("old Paper 1 Marks: "+s[i].getP1());
			System.out.println("Enter Update Paper 1 Marks : ");
		    double p1=Double.parseDouble(sc.nextLine());
		    s[i].setP1(p1);
		    update();
			break;
		case 2:
			System.out.println("old Paper 2 Marks: "+s[i].getP2());
			System.out.println("Enter Update Paper 2 Marks : ");
		    double p2=Double.parseDouble(sc.nextLine());
		    s[i].setP2(p2);
		    update();

			break;
		case 3:
			System.out.println("old Paper 3 Marks: "+s[i].getP3());
			System.out.println("Enter Update Paper 3 Marks : ");
		    double p3=Double.parseDouble(sc.nextLine());
		    s[i].setP3(p3);
			update();

			break;
		}
		break;	
	}
	}
	else{
		user++;
	}
	if(user==k)
	{
		System.out.println("\nStudent Not Found ~");	

	}
  }
}
public void Delete() throws InterruptedException
{
	System.out.println("Enter Roll No : ");
	int roll=Integer.parseInt(sc.nextLine());
	Loding();
	for(i=0;i<k;i++)
	{
		if(roll==s[i].getRoll())
		{
			s[i]=s[k-1];
			k--;
            delete();
            break;
		}
	}
	if(i==k)
	{
		System.out.println("\nStudent not found..");
	}
}

public void Search() throws InterruptedException
{
	int user=0;
	System.out.println("Enter Roll No : ");
	int roll=Integer.parseInt(sc.nextLine());
	Loding();
	for(i=0;i<k;i++)
	{
		if(roll==s[i].getRoll())
		{
			System.out.println("\nShow Data ~");
			System.out.println(" Student-"+(i+1));
			System.out.println(" Roll No: "+s[i].getRoll()+", Name : "+s[i].getName()+", Paper 1: "+s[i].getP1()
					+", Paper 2: "+s[i].getP2()+", Paper 3: "+s[i].getP3());
			double result=(s[i].getP1()+s[i].getP2()+s[i].getP3())/3;
			s[i].setResult(result);
			System.out.println(" Result : "+s[i].getResult());
			System.out.println("...............................|");

		}
		else{
			user++;
		}
		}
	if(user==k)
	{
		System.out.println("\nStudent not found..");

	}
}
public void Loding() throws InterruptedException
{
	System.out.print("Loding");
	for(i=0;i<5;i++)
	{
		System.out.print(".");
		Thread.sleep(150);
	}
}
public void delete() throws InterruptedException
{
	System.out.println("\nData Delete Succsfully");
	for(i=0;i<5;i++)
	{
		System.out.print(".");
		Thread.sleep(150);
	}
}

public void update() throws InterruptedException
{
	System.out.print("\nData update succesfully");
	for(i=0;i<10;i++)
	{
		System.out.print(".");
		Thread.sleep(150);
	}
}
}
