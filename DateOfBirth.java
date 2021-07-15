package practice;

import java.util.Scanner;

public class DateOfBirth {
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter date,month and year values:");
		int date=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		int c=0;
		
		if(year>=1990 && year<=1995) {
			c=1;
		}
		else if(year>=1996 && year<=2000) {
			c=2;
		}
		else if(year>=2001 && year<=2010) {
			c=3;
		}
		else if(year>=2011 && year<=2021) {
			c=4;
		}
		else {
			c=5;
		}
		switch(c) {
		case 1:
			System.out.println("you are early 90's born");
			break;
		case 2:
			System.out.println("you are early 90's born");
			break;
		case 3:
			System.out.println("you are early 90's born");
			break;
		case 4:
			System.out.println("you are early 90's born");
			break;
		case 5:
			System.out.println("you are early 90's born");
			break;
		}
	}

}
