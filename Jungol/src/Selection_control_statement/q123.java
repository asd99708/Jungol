package Selection_control_statement;
import java.util.Scanner;

public class q123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int a = sc.nextInt();
		sc.close();
		
		switch(a) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default :
			System.out.println("I don't know.");
			break;
		}
	}
}