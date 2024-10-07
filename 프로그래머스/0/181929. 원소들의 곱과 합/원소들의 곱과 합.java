class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mult = 1; //모든 원소들의 곱
        int squareN = 0; //모든 원소들의 합의 제곱
        for(int n : num_list){
            mult *= n;
            squareN += n; 
        }
        squareN = squareN * squareN;
        if(mult < squareN) answer = 1;
        return answer;
    }
}