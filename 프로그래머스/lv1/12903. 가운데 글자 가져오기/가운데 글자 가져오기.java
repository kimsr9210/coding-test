class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length() / 2;
        if(s.length() % 2 == 0) { //짝수
        	answer = s.substring(size-1,size+1);
        }else { //홀수
        	answer = s.substring(size,size+1);
        }
        return answer;
    }
}