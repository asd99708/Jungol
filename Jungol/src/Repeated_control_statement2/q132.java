package Repeated_control_statement2;

import java.util.Scanner;

public class q132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= a; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}