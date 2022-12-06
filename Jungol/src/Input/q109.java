package Input;
import java.util.Scanner;

public class q109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int sum = a + b + c;

		System.out.printf("sum = %d", sum);
	}

}
