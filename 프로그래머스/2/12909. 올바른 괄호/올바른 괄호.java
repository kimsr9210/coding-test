class Solution {
    boolean solution(String s) {
        int open = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 && c == ')' || open == -1) return false;
            if(c == '(') open++;
            else if(c == ')') open--;
        }
        boolean answer = (open == 0) ? true : false; 
        return answer;
    }
}