package view;

import java.util.Scanner;

import controller.Control;

public class View {

	Scanner sc=new Scanner(System.in);
	Control c=new Control();
	boolean loop=true;
	public View() throws InterruptedException
	{
		menu();
	}
	public void menu() throws InterruptedException
	{
		while(loop)
		{
		System.out.println("\n1.Insert");
		System.out.println("2.Show");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.Search");
		System.out.println("0.Exit");
		System.out.println("Enter Your Choice : ");
		int ch=Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1:
			c.Insert();
			break;
		case 2:
			c.Show();
			break;
		case 3:
			c.Update();
			break;
		case 4:
			c.Delete();
			break;
		case 5:
			c.Search();
			break;
		case 0:
			System.out.println("Thank you ~");
			loop=false;
			break;
		default:
		System.out.println("Wronge input..");
		}
	}
	}
}