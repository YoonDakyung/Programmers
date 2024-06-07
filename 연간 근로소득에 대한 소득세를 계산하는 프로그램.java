import java.util.Scanner;

public class Tax_calculate {
	public static void main (String args [] ) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ( a <= 20000000 ) {
			System.out.print(a * 0.05);
		} else if ( a >20000000 && a <= 40000000 ) {
			System.out.print(a * 0.15);
		} else if ( a > 40000000 && a <= 80000000 ) {
			System.out.print(a * 0.25);
		} else if ( a > 80000000) {
			System.out.print(a * 0.4);
		}
	}
}
