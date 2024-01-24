package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first number to be averaged?");
		double n1 = in.nextInt();
		System.out.println("You better tell me the second number to be averaged");
		double n2 = in.nextInt();
		double average = (n1 + n2)/2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
		
		
		
	}

}
