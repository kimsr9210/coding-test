class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        int sum = brown + yellow ; 
        for(int i = 2; i < sum; i++) {
        	for(int j = 1; j <= i; j++) {
        		int result = i * j ;
        		int center = (i - 2) * (j - 2); //yellow 길이
        		if(result == sum && i >= j && yellow == center) {
        			answer[0] = i ;
        			answer[1] = j;
        			return answer;
        		}
        	}
        }
        return answer;
    }
}