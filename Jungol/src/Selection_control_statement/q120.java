package Selection_control_statement;
import java.util.Scanner;

public class q120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(a-b);
		} else {
			System.out.println(b-a);
		}
	}
}