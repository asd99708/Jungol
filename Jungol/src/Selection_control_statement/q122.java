package Selection_control_statement;
import java.util.Scanner;

public class q122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a % 400==0 || a % 100 != 0 && a % 4==0) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
	}
}