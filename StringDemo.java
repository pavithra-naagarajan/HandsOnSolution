package practice;

public class StringDemo {

	public StringDemo() {
	}
	
		public static void main(String[] args) {
		String s1="The quick brown fox jumps over the lazy dog";
		
		System.out.println("1.	print the character at 12th index: "+s1.charAt(12));
		
		System.out.println("2.	Check whether the String contains the word “is”: "+ s1.contains("is"));
		
		System.out.println("3.	Add the string “and killed it” to the existing string: "+s1.concat(" and killed it"));
		
		
		System.out.println("4.	Check whether the String ends with the word “dogs”: "+s1.endsWith("dogs"));
		
		String s2 = "The quick brown Fox jumps over the lazy Dog";
		
		System.out.println("5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”: "+s1.equals(s2));
		System.out.println("5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”: "+s1.equalsIgnoreCase(s2));
		
		String s3="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		System.out.println("6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”: "+s1.equals(s3));
		
		System.out.println("7.	Find the length of the String: "+s1.length());
		
		String s4="The quick brown Fox jumps over the lazy Dog";
		
		System.out.println("8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”: "+s1.matches(s4));
		
		System.out.println("9.	Replace the word “The” with the word “A”:"+s1.replace("The", "A"));
		System.out.println("10.	Split the above string into two such that two animal names do not come together: "+"1: "+s1.substring(0,24)+"\n"+"2: "+s1.substring(24,42));
		System.out.println("11.	Print the animal names alone separately from the above string. "+s1.substring(16,19)+" "+s1.substring(40,43));
		System.out.println("12.	Print the above string in completely lower case.  "+s1.toLowerCase());
		System.out.println("13.	Print the above string in completely upper case."+s1.toUpperCase());
		System.out.println("14.	Find the index position of the character “a”: "+s1.indexOf('a') );
		
		System.out.println("15.	Find the last index position of the character e: "+ s1.lastIndexOf('e'));
		}

}
