package Input;
import java.util.Scanner;

public class q9016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		int a = sc.nextInt();
		System.out.print("몸무게를 입력하세요. ");
		double b = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		String c = sc.next();
		sc.close();
		
		System.out.printf("키 = %d\n",a);
		System.out.printf("몸무게 = %.1f\n",b);
		System.out.printf("이름 = %s",c);
	}

}