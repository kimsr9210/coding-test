import java.util.Stack;
class Solution {
    public int solution(String s){
    	int answer = 0; ////성공1 , 실패 0
    	Stack<Character> stack = new Stack<>();
    	for(char c : s.toCharArray()) {
    		if(!stack.isEmpty() && stack.peek() == c) { //stack에 값이 있고 , 맨 위의 원소와 c 가 같다면,
    			stack.pop(); //맨 위에 원소 제거
    		}else {
    			stack.push(c); //삽입
    		}
    	}
    	answer = (stack.isEmpty()) ? 1 : 0 ;
        return answer;
    }
}