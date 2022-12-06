package Repeated_control_statement1;

import java.util.Scanner;

public class q539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		int count = 0;
		while (true) {
			a = sc.nextInt();
			if (a >= 100) {
				sum += a;
				count++;
				break;
			} else {
				sum += a;
				count++;
			}
		}
		sc.close();
		System.out.println(sum);
		System.out.printf("%.1f", (double) sum / count);

	}
}