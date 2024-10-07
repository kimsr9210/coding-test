class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int cupon = 0;
    	while(true) {
            cupon = chicken / 10 ;
        	chicken = (chicken % 10) + cupon ;
        	answer += cupon ;
        	if(chicken < 10) break;
    	}
        return answer;
    }
}
