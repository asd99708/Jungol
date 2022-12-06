package Repeated_control_statement2;
public class q548 {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d * %d = %2d   ", i , j,i*j);
			}
			System.out.println();
		}
	}
}