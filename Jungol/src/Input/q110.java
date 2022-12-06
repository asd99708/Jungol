package Input;
import java.util.Scanner;

public class q110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double a = sc.nextDouble();
		double cm = a * 91.44;
		sc.close();

		System.out.printf("%syard = %.1fcm", a, cm);
	}

}
