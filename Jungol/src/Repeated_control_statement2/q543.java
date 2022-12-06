package Repeated_control_statement2;

import java.util.Scanner;

public class q543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= a; i++) {
			if (i % 2 != 0) {
				System.out.print("");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
