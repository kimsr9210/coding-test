class Solution {
    public int solution(int n) {
        //Arrays.fill(check, true); //배열의 값을 true로 초기화
    	
    	//제곱근이란?
    	//간단히 말해 제곱의 반대 개념
    	//제곱근 메소드 Math.sqrt()
        int answer = 0;
        for(int i = 2; i <= n; i ++) { //2,3,4,5
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
