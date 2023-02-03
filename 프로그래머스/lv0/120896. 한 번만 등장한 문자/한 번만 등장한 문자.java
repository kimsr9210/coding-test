import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";  
        String[] str = s.split("");
        Arrays.sort(str); //정렬

        HashMap<String, Integer> map = new HashMap<String, Integer>(); //key : value
        for(String str2 : str) {
        	Integer cnt = map.get(str2); 
        	if(cnt == null) { //key가 없다면
        		map.put(str2, 1);
        	}else {
        		map.put(str2, cnt+1);
        	}     	
        }
        
        for(String key : map.keySet()) { //key값 가져옴
        	if(map.get(key) == 1) answer+= key;
        }
        char[] charArr = answer.toCharArray(); // String to Char Array
        Arrays.sort(charArr); 
        answer = new String(charArr);
        return answer;
    }
}