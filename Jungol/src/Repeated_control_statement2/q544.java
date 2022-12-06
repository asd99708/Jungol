package Repeated_control_statement2;

import java.util.Scanner;

public class q544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();

		for (; a <= 100; a++) {
			sum += a;
		}
		System.out.println(sum);
	}
}
