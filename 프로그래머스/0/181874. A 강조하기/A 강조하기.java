class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase(); //문자열(string)을 소문자로 변환하는 코드
        answer = myString.replace("a", "A");
        return answer;
    }
}