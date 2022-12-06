package Repeated_control_statement1;
import java.util.Scanner;

public class q128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;

		int count = 0;

		while (true) {
			a = sc.nextInt();
			
			if(a == 0) {
				sc.close();
				break;
			} else if((a%3==0)||(a%5==0)){
				System.out.print("");
			} else {
				count++;
			}
		}
		System.out.println(count);
		
	}
}