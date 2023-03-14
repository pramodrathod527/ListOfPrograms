package problems;

import java.util.Scanner;

public class CharCount {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String Here");
		
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				count++;
			}
			
		}
		System.out.println("Total count of char in given String is: "+count);

	}

}
