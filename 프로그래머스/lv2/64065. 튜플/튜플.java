import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String s) {
        String[] str = s.replaceAll("[{}]", "").split(",");
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String key : str) {
        	map.put(Integer.parseInt(key), map.getOrDefault(Integer.parseInt(key), 0)+1);
        }
        
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); //hashMap을 list로 변환
        
        //람다식으로 간략하게 표현
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue())); //정렬
        
        int cnt = 0;
        int[] answer = new int [list.size()];
        for(Map.Entry<Integer, Integer> entry : list) {
        	answer[cnt] = entry.getKey();
        	cnt++;
        }
        return answer;
    }
}