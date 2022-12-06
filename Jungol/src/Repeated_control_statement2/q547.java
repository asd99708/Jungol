package Repeated_control_statement2;

public class q547 {
	public static void main(String[] args) {
		for(int i = 1, v = 2; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.printf("%d ", v++);
			}
			v-=4;
			System.out.println();
		}
	}
}