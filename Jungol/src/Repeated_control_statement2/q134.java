package Repeated_control_statement2;

import java.util.Scanner;

public class q134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 10; i++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				even++;
			} else if (a % 2 != 0) {
				odd++;
			}
		}
		sc.close();

		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}