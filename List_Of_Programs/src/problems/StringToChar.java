package problems;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String Here");
		
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
		}
	}

}
