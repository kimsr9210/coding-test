import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            hashMap.put(want[i], number[i]);
            
        }
        int join = 10;
        for(int i = 0; i < (discount.length - join) + 1; i++){
            HashMap<String,Integer> mart = new HashMap<>();
            for(int j = 0; j < 10; j++){
                mart.put(discount[i+j],mart.getOrDefault(discount[i+j],0)+1); 
            }
            
            boolean isTrue = true;
            
            for(String key : hashMap.keySet()){
                if(mart.get(key) != hashMap.get(key)){
                    isTrue = false;
                    break;
                }
            }
            answer += isTrue ? 1 : 0;
        }  
        return answer;
    }
}