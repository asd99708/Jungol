package Selection_control_statement;
import java.util.Scanner;

public class q533_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int age = sc.nextInt();
		sc.close();

		switch(a) {
		case "M":
			if(age>=20) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
			break;
		case "F":
			if(age>=20) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
			break;
		}
	}
}