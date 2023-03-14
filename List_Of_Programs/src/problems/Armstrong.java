package problems;

import java.util.Scanner;

public class Armstrong {
	
	static boolean isArmstrong(int num) {
		int temp;
		int digit = 0;
		int last = 0;
		int sum = 0;
	    temp = num;
		
	while(temp>0) {
		temp = temp/10;
		digit++;
		
	}
	
	temp = num;
	
	while(temp>0) {
		last = temp % 10;
		sum += Math.pow(last, digit);
		
		temp = temp/10;
	}
	
	if(sum==num) {
		return true;
	}else {
		return false;
	}
				
		
	}

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int number  = sc.nextInt();
		
		if(isArmstrong(number)) {
			System.out.println(number+" is Armstrong!");
		}else {
			System.out.println(number+" is not Armstrong!");
		}
		
		
		
		
		

	}

}
