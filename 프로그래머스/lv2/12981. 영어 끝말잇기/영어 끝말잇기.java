import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0}; 
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(words[0]);
        
        String before = words[0].substring(words[0].length()-1, words[0].length());
        
        for(int i = 1; i < words.length; i++) {
        	if(!hashSet.contains(words[i])) {
        		hashSet.add(words[i]);
        	}else if(hashSet.contains(words[i]) || words[i].length() < 2){
        		answer[0] = (i % n) + 1;//사람 번호
        	    answer[1] = (i / n) + 1; //차례
        	    return answer;
        	}
    
        	String now = words[i].substring(0, 1);
        	if(!before.equals(now)) {
        		answer[0] = (i % n) + 1;//사람 번호
        	    answer[1] = (i / n) + 1; //차례
                return answer;
        	}
            
        	before = words[i].substring(words[i].length()-1, words[i].length());
            
        }
        
        return answer;
    }
}