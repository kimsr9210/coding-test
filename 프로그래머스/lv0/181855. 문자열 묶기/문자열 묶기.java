import java.util.HashMap;
import java.util.TreeSet;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>(); 
        for(String s : strArr){
            int key = s.length();
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }

        for(Integer key : hashMap.keySet()) treeSet.add(hashMap.get(key));

        int answer = treeSet.last();
        return answer;
    }
}