import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open = 0;
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(0) == ')' || open == -1){
                answer = false;
                break;
            }else if(s.charAt(i) == '('){
                open++;
            }else if(s.charAt(i) == ')'){
                open--;
            }
        }
        if(open != 0) answer = false;
        return answer;
    }
}