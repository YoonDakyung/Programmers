public class ForTest1 {
  public static void main(String args[]) {
    int add = 0; //정수형 변수 add를 설정하고 0으로 초기화

    //1부터 10까지의 수를 더하는 for문
    for(int i = 0; i <= 10; i++) { //i를 0부터 시작해서 10까지 반복하는 for문(i가 10까지 포함되야 함)
      add += i; //현재 i의 값을 add에 누적하여 더함
    }

    //1부터 10까지의 합을 출력
    System.out.print("1부터 10까지의 합은 : " + add);
  }
}
