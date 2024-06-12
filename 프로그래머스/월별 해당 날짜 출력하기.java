import java.util.Scanner;

public class SwitchExam_4 {
         public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int day;
		switch( a ) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31 ; break ;
		case 4 : case 6 : case 9 : case 11 :
			day = 30 ; break ; //각 해당되는 월의 일 개수를 작성한다.
		default : day = 28; //2월만 28일이다.
	}
		System.out.println( a + "월은" + day + "일입니다.");
	}
}
