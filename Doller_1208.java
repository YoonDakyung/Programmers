public class Doller_1208 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("원화를 입력하세요(단위 : 원) : "); //사용자에게 원화 입력을 요청
		int money = sc.nextInt(); //입력 받는 원화를 정수형 변수 'money'에 저장
		
		//원화를 달러로 변환하는 과정
		//원화(money)를 1260.0으로 나누어 달러 환산 값을 'result'에 저장
		double result = money / 1260.0; //1$를 구하기 위한 식
		
		//달러 환산 값을 소수점 둘째 자리에서 반올림하여 'answer'에 저장
		//Math.round(result * 100) / 100.0 :
		//1. result에 100을 곱해 소수점 둘째 자리까지 정수로 만듦
		//2. 'Math.round()' 메서드 : 소수점 둘째 자리까지 반올림
		//3. 반올림된 값을 다시 100.0으로 나누어 소수점 둘째 자리까지 표현
		double answer = Math.round(result * 100) / 100.0; //출력 값
		
		//'money'와 'answer'를 형식에 맞춰 출력
		//%d : 정수형 'money'를 출력
		//%.2f : 소수점 둘째 자리까지의 실수형 'answer'를 출력
		System.out.printf("%d원은 $%.2f입니다.", money, answer);
	}
}
