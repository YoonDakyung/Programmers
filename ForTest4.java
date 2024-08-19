import java.util.Scanner;

public class ForTest4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10이하의 정수를 입력하시오 : ");
		int a = sc.nextInt();
		String b = "MSG";
		
		if(a > 10) {
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		} else {
			for(int i = 0; i < a; i++) {
				System.out.println(b);
			}
			
			sc.close();
		}
	}
}
