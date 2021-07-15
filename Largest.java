package practice;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter x,y and z:");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		if(x>y && x>z) 
			System.out.println("x is the largest");
		
		else if(y>z) 
			System.out.println("y is the largest");
		
		else
			System.out.println("z is the largest");
		
	}

}
