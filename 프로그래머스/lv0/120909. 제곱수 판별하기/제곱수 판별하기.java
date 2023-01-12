class Solution {
    public int solution(int n) {
        int answer = 2;
        int result = 0;
        System.out.println(n);
        for(int i = 1; i < n ; i ++) {
        	++result; 
        	if(i * result == n ) {
        		answer = 1;
        		break;
        	}
        }    
        return answer;
    }
}