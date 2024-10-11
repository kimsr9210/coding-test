class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(c[i] == ' ') {
                answer += ' ';
            }else{
                int num = c[i] + n ;
                if(c[i] > 64 && c[i] < 91  &&  num > 90){ //대문자
                    answer += (char)(64 + (num - 90));
                }else if(c[i] > 96 && c[i] < 123 && num > 122){ //소문자
                    answer += (char)(96 + (num) - 122);
                }else{
                    answer += (char)num;
                }
            }
        }
        return answer;
    }
}