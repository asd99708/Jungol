package Repeated_control_statement2;
import java.util.Scanner;

public class q546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		double avg = 0;
		for(int i = 1;i <= a;i++) {
			int b = sc.nextInt();		
			sum += b;
		}
		avg = (double) sum / a ;
		System.out.printf("avg : %.1f\n",avg);
		if(avg >= 80 ) {
			System.out.println("pass");
		} else if (avg<80) {
			System.out.println("fail");
		}
		sc.close();
	}
	
}