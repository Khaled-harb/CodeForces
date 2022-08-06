package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		char numbers[] = new char[s.length() / 2 + 1];

		int counter = 0;
		for (int i = 0; i < s.length(); i += 2) {
			numbers[counter] = s.charAt(i);
			counter++;

		}

		Arrays.sort(numbers);

		for (int i = 0; i < counter; ++i) {
			System.out.print(numbers[i]);
			if (i < counter - 1) {
				System.out.print("+");
			}
		}
		System.out.println("  >>>> sorted!");
	}

}
