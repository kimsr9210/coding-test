class Solution {
    public long solution(long n) {
    	//양의 정수 : 숫자에 플러스가 붙은것 +8 
    	//음의 정수 : 숫자에 마이너스가 붙은것 -8
    	//Math.sqrt() : 제곱수 반환 
    	//제곱수란 ? : 같은수를 두번 곱해서 나오는 수 5 * 5 = 25 -> 25가 제곱수이다 
    	long answer = (long)Math.sqrt(n);
    	if(answer * answer == n) {
        	answer = answer + 1 ;
        	answer = answer * answer ;
    	}else {
    		answer = -1;
    	}
        return answer;
    }
}