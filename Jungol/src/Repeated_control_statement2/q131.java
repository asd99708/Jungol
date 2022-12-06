package Repeated_control_statement2;
import java.util.Scanner;

public class q131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a > b) {
			for(; b <= a; b++) {
				System.out.print(b+" ");
			}
		} else {
			for(; a <= b; a++) {
				System.out.print(a+" ");
			}
		}
	}
}