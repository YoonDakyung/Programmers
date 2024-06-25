import java.util.Scanner;

public class SwitchExam5 {
         public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
  		String b = ""; //학과 설명
    switch(a) {
      case 1 : case 2 : case 3 : case 4 :
          b = "뉴미디어 소프트웨어과";
              break;
      case 5 : case 6 :
          b = "디자인과";
              break;
        }
           System.out.println(a + "반은" + b + "입니다.");
        }
}
