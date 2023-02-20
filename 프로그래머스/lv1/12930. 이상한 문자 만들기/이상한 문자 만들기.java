class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;   
        String[] str = s.split(""); 
        for(int i = 0; i < str.length; i++) {
        	cnt = (str[i].equals(" ")) ? 0 : cnt+1;
        	str[i] = (cnt % 2 == 0) ? str[i].toLowerCase() : str[i].toUpperCase();
        	answer += str[i];
        }
        return answer;
    }
}