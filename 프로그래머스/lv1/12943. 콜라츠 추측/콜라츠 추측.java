class Solution {
    public int solution(int num) {
    	long n = num;
    	int cnt = 0;
        int answer = 0;
        
        for(int i = 1; i <= 501; i++) { //501번반복
        	if(n == 1 && cnt == 0) {
        		answer = 0;
        		break;
        	}else if(n != 1 && cnt >= 500) { 
        		answer = -1;
        		break;
        	}else if(n == 1 && cnt > 1) {
        		answer = cnt;
        		break;
        	}else if(cnt < 500) {
            	cnt++;
            	if(n % 2 == 0 && cnt < 501) { //짝수
            		n = n / 2 ;
            	}else if(n % 2 != 0 && cnt < 501){
            		n = (n * 3) +1 ;
            	}
        	}
        }    
        return answer;
    }
}