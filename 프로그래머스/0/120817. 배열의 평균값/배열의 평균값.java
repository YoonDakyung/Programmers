class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        } answer = (double) a / numbers.length;
        return answer;
    }
}