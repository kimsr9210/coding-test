class Solution {
    public int solution(int n) {
    	//제곱근이란?
    	//간단히 말해 제곱의 반대 개념
    	//제곱근 메소드 Math.sqrt()        
        int answer = 0;
        for(int i = 2; i <= n; i ++) {
        	int cnt = 0;
        	for(int j = 2; j <= (int)Math.sqrt(i); j++) {
        		if(i % j == 0) cnt++;
        		if(cnt == 1) break;
        	}
        	if(cnt == 0) answer++;
        }
        return answer;
    }
}