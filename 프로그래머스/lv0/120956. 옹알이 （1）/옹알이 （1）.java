class Solution {
    public int solution(String[] babbling) {
        int answer = 0;      
        if(babbling.length <= 100) {
            for(int i = 0; i < babbling.length; i++) {
            	if(babbling[i].length() <= 15) { 
                	babbling[i] = babbling[i].replaceAll("aya", "1");
                 	babbling[i] = babbling[i].replaceAll("ye", "1");
                 	babbling[i] = babbling[i].replaceAll("woo", "1");
                 	babbling[i] = babbling[i].replaceAll("ma", "1");
                 	babbling[i] = babbling[i].replaceAll("1", "");
                    if(babbling[i].isEmpty()) answer++;
            	}
            }
        }
        return answer;
    }
}