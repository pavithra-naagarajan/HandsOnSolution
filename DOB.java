package practice;

import java.util.Scanner;

public class DOB {
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter date,month and year values:");
		int date=s.nextInt();
		int month=s.nextInt();
		int year=s.nextInt();
		
		switch(year){
		
		case 1990: case 1991: case 1993: case 1994: case 1995:
			
			 System.out.println("you are early 90's born");
		break;
		case 1996: case 1997: case 1998: case 1999: case 2000:

			 System.out.println("you are late 90's born");
		break;
		
		case 2001: case 2002: case 2003: case 2004: case 2005:case 2006: 
			case 2007: case 2008: case 2009: case 2010:

			 System.out.println("you are new decade born");
		break;
		case 2011: case 2012: case 2013: case 2014: case 2015:case 2016: 
			case 2017: case 2018: case 2019: case 2020: case 2021:

			 System.out.println("you are recently born");
		break;
		default :
			System.out.println("invalid");
			break;
		



			
		
		}
		
	}
	

}
