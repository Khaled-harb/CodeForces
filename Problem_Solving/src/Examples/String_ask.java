package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class String_ask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('u');
		vowels.add('o');
		vowels.add('y');
		String new_word = ".";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != '.')
				if (!vowels.contains(word.charAt(i)))
					new_word += word.charAt(i) + ".";

		}
		System.out.println(new_word.toLowerCase());
	}

}
