class Solution {

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }
}

/*class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        int j = 0;
        while(j<overwrite_string.length()){
            answer += overwrite_string.charAt(j);
            j++;
        }
        int k = j+s;
        while(k<my_string.length()){
            answer += my_string.charAt(k);
            k++;
        }
        return answer;
    }
}*/