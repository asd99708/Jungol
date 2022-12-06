package Repeated_control_statement1;
import java.util.Scanner;

public class q129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double c = 0;
		char d;
		
		while(true) {
			System.out.print("Base = ");
			a = sc.nextInt();
			System.out.print("Height = ");
			b = sc.nextInt();
			c = (double)(a*b)/2;
			System.out.printf("Triangle width = %.1f\n",c);
			System.out.print("Continue? ");
			d = sc.next().charAt(0);
			if ((d!='Y')&&(d!='y')) {
				break;
			}
		}
		sc.close();
	}
}