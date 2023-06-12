class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            int num = myString.charAt(i);
            if(num < 108) num = 108;
            char ch = (char)num;
            answer += String.valueOf(ch);
        }
        System.out.println(answer);
        return answer;
    }
}