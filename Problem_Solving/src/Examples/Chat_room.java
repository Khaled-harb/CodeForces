package Examples;

import java.util.Scanner;

public class Chat_room {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String hello = "hello";
		// ahhellllloou
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == hello.charAt(counter))
				counter++;
			if (counter == hello.length())
				break;
		}
		if (counter >= hello.length()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
