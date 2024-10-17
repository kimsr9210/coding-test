import java.util.*;
class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() &&stack.peek() == c){
                stack.pop();
            }else{
                stack.add(c);
            }
        }
        int answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }
}