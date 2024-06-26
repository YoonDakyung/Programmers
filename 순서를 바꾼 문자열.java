import java.util.Scanner;

public class Str {
         public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a, b, c = " ";

		System.out.print("문자를 입력하세요 : ");
			a = sc.nextLine();
		System.out.print("문자를 입력하세요 : ");
			b = sc.nextLine();

		c = a;
		a = b;
		b = c;

		System.out.println(a + " " + b);
	}
}
