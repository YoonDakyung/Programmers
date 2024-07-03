import java.util.Scanner;

public class SwitchOp {
        public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("수식 입력(수와 연산자 사이는 공백을 둘 것) : ");
		int a = sc.nextInt(); //숫자
		String op = sc.next(); //사칙연산
		int b = sc.nextInt(); //숫자
		String answer = " ";

	switch( op ) {
		case "+" :
			answer = Integer.toString(a + b); break;
		case "-" :
			answer = Integer.toString(a - b); break;
		case "*" :
			answer = Integer.toString(a * b); break;
		case "/" :
			answer = Integer.toString(a / b); break;
		default : answer =  "사칙연산자가 아닙니다.";
		}
	System.out.println(a + " " + op + " " + b + " " + "=" + " " + answer);
	}
}
