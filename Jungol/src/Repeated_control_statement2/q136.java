package Repeated_control_statement2;

import java.util.Scanner;

public class q136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 10; i++) {
			System.out.print(a * i + " ");
		}
	}
}