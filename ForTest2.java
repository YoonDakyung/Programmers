public class ForTest2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 10; //for문을 돌리기 위한 변수 a, b
		
		for(int i = 0; i < 10; i++) {
			System.out.println(a + "\t" + b);
				a++;
				b--;
		}
	}
}
