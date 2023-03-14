package problems;

import java.util.Scanner;

public class ArmstrongList {
	
	static boolean isArmstrong(int num) {
		int temp;
		int digit = 0;
		int sum = 0;
		int last = 0;
		temp= num;
		
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		
		temp = num;
		
		while(temp>0) {
			last = temp%10;
			
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
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Input Here");
		
		int num = sc.nextInt();
		
		System.out.println("Armstrong upto "+num+" are:");
		
		for(int i = 0; i<=num; i++) {
			if(isArmstrong(i)) {
				System.out.print(i+",");
			}
		}

	}
	
}
