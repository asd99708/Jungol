package Selection_control_statement;
import java.util.Scanner;

public class q121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a==0) {
			System.out.println("zero");
		} else if(a<0){
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
	}
}