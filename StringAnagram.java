package practice;

import java.util.Scanner;
import java.util.Arrays;

public class StringAnagram {

	
	
		public static void main(String[] args) {
			
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the first String : ");
			String str1 = s.nextLine();
			System.out.println("Enter the Second String : ");
			String str2 = s.nextLine();
			
		
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			if (str1.length() != str2.length()) {
				System.out.println("Both the strings are not anagram");
			} else {
				
				char[] string1 = str1.toCharArray();
				char[] string2 = str2.toCharArray();

				
				Arrays.sort(string1);
				Arrays.sort(string2);

				
				if (Arrays.equals(string1, string2) == true) {
					System.out.println("The strings are Anagram");
				} else {
					System.out.println("The strings are not Anagram");
				}
			}
		
		
		
	}

}
