class Solution {
    public int[] solution(int n, int s) {
    	int[] answer;
    	
        if(n > s) {
        	answer = new int []{-1};
        	return answer;
        }
        
        int init = s / n; //몫
        int mod = s % n; //나머지
        
        answer = new int [n];
        for(int i = 0; i < n; i++) {
        	answer[i] = init;
        }
        
        int index = n - 1;
        for(int i = 0; i < mod; i++) {
        	answer[index]++;
        	index--;
        }
        
        return answer;
    }
}