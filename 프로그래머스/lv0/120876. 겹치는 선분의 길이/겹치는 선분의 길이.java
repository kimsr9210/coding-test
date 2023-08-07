class Solution {
    public int solution(int[][] lines) {
        //선분이 지나가는 점을 찾아야 한다
        int answer = 0;
        
        int[] cnt = new int [201]; 
        
        for(int[] l : lines){
            int start = l[0]+100;
            int end = l[1]+100;
            for(int j = start; j < end; j++){
                cnt[j] += 1;
            }
        }
        
        for(int c : cnt) if(c > 1) answer++;
        
        return answer;
    }
}