import java.util.Scanner;

public class ForTest6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("정수 10개를 입력하세요 : ");
				int count = 0;
				
				String a = sc.nextLine();
				String[] array = a.split(" ");
				
					for(int i = 0; i < array.length; i++) {
						int num = Integer.parseInt(array[i]);
								if(num % 3 == 0 || num % 5 == 0) {
									count++;
								}	
						}
					
					System.out.println("3과 5의 배수의 개수 : " + count);
					sc.close();
	}
}
