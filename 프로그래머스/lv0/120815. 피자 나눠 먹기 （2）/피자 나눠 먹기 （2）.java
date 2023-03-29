class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizz = 0;

        for(int i = 1; i <= 100; i++ ) {
        	pizz = 6 * i;
        	if(pizz % n == 0) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}