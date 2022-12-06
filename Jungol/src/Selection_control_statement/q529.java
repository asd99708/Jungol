package Selection_control_statement;

import java.util.Scanner;

public class q529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int obe = b + 100 - a;
		System.out.println(obe);
		if (obe > 0) {
			System.out.println("Obesity");
		}
	}

}
