package exceptiondemo;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		Calculator cal=new Calculator();
		cal.exceptionDemo();
	}
	public void exceptionDemo(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers ");
		int x=0;
		int y=0;
		try {
			x=s.nextInt();
			y=s.nextInt();
			System.out.println("addition answer:"+(x+y));
		
			System.out.println("subtraction answer:"+(x-y));
		
			
			System.out.println("multiplication answer:"+(x*y));
			System.out.println("division answer:"+(x/y));
		}
		
		
		catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of range");
		}
		catch( InputMismatchException e){
			System.out.println("inputs are not valid");
		}
		
		
		finally
		{
			System.out.println("Thanks for using the calculator");
		}
		
		
	}

}
