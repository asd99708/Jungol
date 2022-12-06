package Repeated_control_statement1;

import java.util.Scanner;

public class q537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		int sum = 0;
		sc.close();

		while (b <= a) {
			sum += b;
			b++;
		}
		System.out.println(sum);
	}
}