package Selection_control_statement;
import java.util.Scanner;

public class q124 {
	public static void main(String[] args) {
		int [] b = { 31, 28, 31, 30, 
				31, 30, 31, 31, 30, 31, 30, 31}; 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		a = a - 1;
		
		System.out.println(b[a]);
	}
}