class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 && c == ')' || open == -1) return false;
            open += (c == '(') ? +1 : -1;
        }
        
        if(open != 0) answer = false;
        return answer;
    }
}