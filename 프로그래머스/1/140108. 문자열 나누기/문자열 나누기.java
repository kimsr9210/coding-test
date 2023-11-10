class Solution {
    public int solution(String s) {
        int answer = 1;
        int x = s.charAt(0);
        int count = 0;
        for(int i = 1; i < s.length(); i++) {
        	if(count == 1) {
        		answer++;
        		x = s.charAt(i);
        	}
            
        	if(x == s.charAt(i)) {
        		count--;
        	}else {
        		count++;
        	}
        }
        return answer;
    }
}