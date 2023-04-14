class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0}; //짝수,홀수
        int even = 0; //짝수
        int odd = 0; //홀수
        for(int n : num_list){
            if(n % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}