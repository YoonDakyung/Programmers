import java.util.Scanner;

public class Absolute_Test {
         public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt(); //입력받는 값
		int answer = 0; //출력하려는 값

		if(a>=0) {
			answer = a;
		} else {
			answer = a * (-1);
		} System.out.println(a + "의 절댓값은 " + answer + "입니다."); 
	}
}
