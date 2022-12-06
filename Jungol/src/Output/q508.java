package Output;
public class q508 {
	public static void main(String[] args) {
		String [] a = {"item","count","price",
				"pen","20","100",
				"note","5","95",
				"eraser","110","97"};
		for(int i = 0;i<12;i++) {
			System.out.printf("%10s",a[i]);
			i++;
			System.out.printf("%10s",a[i]);
			i++;
			System.out.printf("%10s\n",a[i]);
		}
	}
}