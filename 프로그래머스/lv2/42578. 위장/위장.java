import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
     
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0 ; i < clothes.length; i++) {
        	String key = clothes[i][1];
        	hashMap.put(key, hashMap.getOrDefault(key, 1)+1); //키가 있다면 value값을 가져와 +1 해준다.
        }
        
        for(String key : hashMap.keySet()) { 
        	answer *= hashMap.get(key);
        }
        answer = answer - 1;
        return answer;
    }
}