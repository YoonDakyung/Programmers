import java.util.Scanner;

public class Salary_Switch {
         public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double currentSalary; //현 연봉
		String rating; //근무 평가등급
		double raise = 0.0; //연봉 인상액
		double newSalary; //새 연봉

		System.out.print("현 연봉을 입력하세요 : ");
		currentSalary = sc.nextDouble();

		sc.nextLine();

		System.out.print("근무평가등급을 입력하세요 : ");
		rating = sc.nextLine();

		switch(rating) {
			case "우수" :
					raise = (currentSalary * 0.06);
					break;
			case "보통" :
					raise = (currentSalary * 0.04);
					break;
			case "불량" :
					raise = (currentSalary * 0.02);
					break;
		}
		newSalary = currentSalary + raise;
		System.out.println("연봉인상액 : " + (int)raise);
		System.out.println("새 연봉 : " + (int)newSalary);
	}
}
