package Input;
import java.util.Scanner;

public class q515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int mul = a*b;
		int div = a/b;
		
		System.out.printf("%d * %d = %d\n%d / %d = %d",a,b,mul,a,b,div);
		
	}

}
