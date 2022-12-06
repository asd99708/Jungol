package Selection_control_statement;
import java.util.Scanner;

public class q533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int age = sc.nextInt();
		sc.close();

		if (a.equals("M")) {
			if (age >= 20) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if(age >= 20) {
				System.out.println("WOMAN");
			}else {
				System.out.println("GIRL");
			}
		}
	}
}