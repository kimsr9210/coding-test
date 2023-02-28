import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
    	HashMap<Character, Integer> hashMap = new HashMap<>();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
        	char alpha = s.charAt(i);
        	//getOrDefault()
        	//찾는 키가 존재한다면 1 
        	//존재하지 않다면 -1
        	answer[i] = i - hashMap.getOrDefault(alpha, i+1);
        	hashMap.put(alpha, i);
        }
        return answer;
    }
}