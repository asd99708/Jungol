package Repeated_control_statement1;

import java.util.Scanner;

public class q125 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= a; i++) {
			System.out.printf("%d ", i);
		}
	}
}