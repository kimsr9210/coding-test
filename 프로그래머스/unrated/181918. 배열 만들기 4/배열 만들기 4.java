import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int i = 0;
        while(i < arr.length){
            if(stack.isEmpty() || arr[i] > stack.peek()){
               stack.push(arr[i]); 
               i++;
            }else{
                int s = stack.peek(); //마지막 원소를 반환
                if(s >= arr[i]) stack.pop();
            }
        }
        
        int[] stk = new int[stack.size()];
        for(int j = stk.length-1; j >= 0; j--) stk[j]  = stack.pop();
        
        return stk;
    }
}