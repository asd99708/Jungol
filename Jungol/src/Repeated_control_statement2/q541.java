package Repeated_control_statement2;

import java.util.Scanner;

public class q541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();

		for (int i = 1; i <= 20; i++) {
			System.out.print(a);
		}
	}
}
