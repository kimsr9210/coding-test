import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        //값을 리턴..
        
        //list , hashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        for(int a : array){
            hashMap.merge(a,1,Integer::sum);
        }
        
        //list.addAll(hashMap.entrySet());
        list.addAll(hashMap.values());
        
        //list 정렬 
        Collections.sort(list, Collections.reverseOrder());

        if(list.size() > 1 && list.get(0) == list.get(1)) return -1;
        else{
            for(int i : hashMap.keySet()){
                if(hashMap.get(i) == list.get(0)) return i;
            }
        }
        return answer;
    }
}