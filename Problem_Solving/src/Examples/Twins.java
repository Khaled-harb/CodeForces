package Examples;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter the number of coins : ");
		int num_coins = scan.nextInt();
		System.out.println(" Please enter the value of coins : ");
		int coins[] = new int[num_coins];
		int sum = 0;
		for (int i = 0; i < num_coins; i++) {
			coins[i] = scan.nextInt();
			sum += coins[i];
		}
		int j = 0;
		Arrays.sort(coins);
		int my_coins = coins[coins.length - 1];
		while (my_coins <= sum - my_coins) {
			j += 1;
			my_coins += coins[coins.length - 1 - j];
		}
		System.out.println(j + 1);

	}

}
