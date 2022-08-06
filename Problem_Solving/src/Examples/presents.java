package Examples;

import java.util.Scanner;

public class presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, i;
		n = scan.nextInt();
		int[] num = new int[n + 5];
		int[] nums = new int[n + 5];
		for (i = 1; i <= n; i++) {
			num[i] = scan.nextInt();
			nums[num[i] - 1] = i;
		}
		for (i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
