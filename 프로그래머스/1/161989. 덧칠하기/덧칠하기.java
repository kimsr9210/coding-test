class Solution {
    public int solution(int n, int m, int[] section) {
        //페인트 칠하는 롤러의 길이 m
        int answer = 0;
        int max = 0;
        for(int i = 0; i < section.length; i++){
            if(max > section[i]) continue;
            
            answer++;
            max = section[i] + m;
        }
        
        return answer;
    }
}