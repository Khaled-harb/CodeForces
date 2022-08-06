package Examples;

import java.util.Scanner;

public class Watermelon {
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Watermelon weigt (Number only) :");

		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		boolean answer;
		if (weight % 2 == 0) {
			answer = true;
		} else {
			answer = false;
	}
	System.out.println(answer);	

	
	}
}
