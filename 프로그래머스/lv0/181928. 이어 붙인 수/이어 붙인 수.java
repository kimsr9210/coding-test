class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = ""; //홀수
        String num2 = ""; //짝수
        for(int n : num_list){
            if(n % 2 == 1) num1 += n;
            if(n % 2 == 0) num2 += n;
        }
        answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        return answer;
    }
}
