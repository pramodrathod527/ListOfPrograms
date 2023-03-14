package problems;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Limit Here: ");
		int limit = sc.nextInt();
		
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm;
		
		System.out.print(firstTerm+","+secondTerm);
		
		for(int i=2;i<limit;++i) {
			nextTerm = firstTerm+secondTerm;
			System.out.print(","+nextTerm);
			firstTerm = secondTerm;
			secondTerm= nextTerm;
			
			
		}

	}

}
