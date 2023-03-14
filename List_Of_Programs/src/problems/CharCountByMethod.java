package problems;

import java.util.Scanner;

public class CharCountByMethod {
	
	public static void Charcount(String str) {
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println("Total count of char in String is: "+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Input Here");
		
		String string = sc.nextLine();
		
		Charcount(string);
		

	}

}
