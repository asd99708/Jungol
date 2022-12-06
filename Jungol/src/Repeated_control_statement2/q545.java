package Repeated_control_statement2;

import java.util.Scanner;

public class q545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a1 = new int[10];
		int m3 = 0;
		int m5 = 0;
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] % 3 == 0) {
				m3++;
			}
			if (a1[i] % 5 == 0) {
				m5++;
			}
		}
		System.out.printf("Multiples of 3 : %d\n", m3);
		System.out.printf("Multiples of 5 : %d\n", m5);
	}
}
