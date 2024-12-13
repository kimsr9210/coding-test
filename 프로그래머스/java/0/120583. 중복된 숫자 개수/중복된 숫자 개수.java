class Solution {
    public int solution(int[] array, int n) {
    	int answer = 0;
    	for(int l : array) {
    		if(n == l) {
    			answer++;
    		}
    	}
        return answer;
    }
}