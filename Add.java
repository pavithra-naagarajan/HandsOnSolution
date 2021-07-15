package practice;

import java.util.Scanner;

public class Add {
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int j=0;
		int[] numbers=new int[5];
		while(j<5) {
			numbers[j]=(int)s.nextInt();
			j++;
		}
		int ans=0;
		
		for(int i:numbers) 
		{
			ans+=i;
		}
		
		System.out.println("The result is:"+ans);

	}

}
