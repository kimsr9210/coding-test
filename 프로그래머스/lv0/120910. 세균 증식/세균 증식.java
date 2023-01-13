class Solution {
    public int solution(int n, int t) {
    	int answer = 0;
    	
    	for(int i = 1; i <= t; i++) {
    		answer = n *= 2 ; // *= 오른쪽 연산자의 값을 변수에 곱한 결과 변수에 할당
    	}
    	/*
    	answer = n * (int)Math.pow(2, t); //거듭제곱 함수
    	-> 2번씩 t 만큼 거듭제곱수를 구한다.
    	*/
    	System.out.println(answer);
        return answer;
    }
}