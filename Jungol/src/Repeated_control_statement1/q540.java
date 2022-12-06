package Repeated_control_statement1;

import java.util.Scanner;

public class q540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		while (true) {
			a = sc.nextInt();
			b = a % 3;
			if (b == 0) {
				System.out.println(a / 3);
			} else if (a == -1) {
				break;
			}
		}
		sc.close();
	}
}