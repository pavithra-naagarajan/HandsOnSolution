package practice;

import java.util.Scanner;

public class StringDemo2 {

	public StringDemo2() {
		
	}
	public static void main(String[] args) {
		StringBuilder names=new StringBuilder();
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println(names.append(s.nextLine()));
		}
		
	}

}
