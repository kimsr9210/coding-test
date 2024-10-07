class Solution {
    public int solution(int[] num_list) {
        int idex = 0;
        int odd  = 0 ; //홀수 
        int even = 0 ; //짝수
        for(int i = 1; i <= num_list.length; i++){
            if(i % 2 == 0)  even += num_list[idex];
            if(i % 2 != 0)  odd += num_list[idex];
            idex++;
        }
        int answer = Math.max(even, odd);
        return answer;
    }
}