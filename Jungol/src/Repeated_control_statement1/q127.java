package Repeated_control_statement1;
import java.util.Scanner;

public class q127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;

		int count = 0;

		while (true) {
			a = sc.nextInt();
			
			if((a>=0) && (a<=100)) {
				sum += a;
				count++;
			} else {
				sc.close();
				break;
			}
		}
		double avg = (double)sum/count;
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.1f",avg);
	}
}

