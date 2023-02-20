class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();   
        String[] str = s.split(""); 
        for(int i = 0; i < str.length; i++) {
        	if(i % 2 == 0) { //짝수
        		str[i] = str[i].toUpperCase();
        	}
        	answer += str[i];
        }
        return answer;
    }
}