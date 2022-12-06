package Repeated_control_statement2;

import java.util.Scanner;

public class q135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int count = 0;
		double avg = 0;
		sc.close();

		if (a >= b) {
			for (int i = b; i <= a; i++) {
				if ((i % 3 == 0) || (i % 5 == 0)) {
					sum += i;
					count++;
				}
			}
		} else if (b >= a) {
			for (int i = a; i <= b; i++) {
				if ((i % 3 == 0) || (i % 5 == 0)) {
					sum += i;
					count++;
				}
			}
		}
		avg = (double) sum / count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}