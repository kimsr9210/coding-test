class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;   
        String[] str = s.split(""); 
        for(int i = 0; i < str.length; i++) {
        	if(str[i].equals(" ")) {
        		cnt = 0;
        	}else if(cnt % 2 == 0) {
        		str[i] = str[i].toUpperCase();
            	cnt++;
        	}else if(cnt % 2 != 0) {
        		str[i] = str[i].toLowerCase();
                cnt++;
        	}
        	answer += str[i];
        }
        return answer;
    }
}