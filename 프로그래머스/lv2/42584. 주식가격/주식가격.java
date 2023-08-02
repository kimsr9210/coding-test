class Solution {
    public int[] solution(int[] prices) {
        //이중 포문으로 푸는 방법
        int[] answer = new int [prices.length];
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                answer[i]++;
                if(prices[i] > prices[j]) break;
            }
        }

        /* [스택으로 푸는 방법]
        int[] answer = new int [prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek(); //index 3
                stack.pop();
            }
            stack.push(i); //0
        }

        while(!stack.isEmpty()){
            System.out.println(stack);
            answer[stack.peek()] = prices.length - stack.peek() - 1; //5 - 4 - 1 => 4 3 1 0
            stack.pop();
        }
        
        */

        
        return answer;
    }
}
