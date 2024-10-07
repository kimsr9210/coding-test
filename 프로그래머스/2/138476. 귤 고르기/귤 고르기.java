import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t : tangerine) {
        	//getOrDefault() : 키가 맵에 없는경우 기본값 반환 
        	//기본값 0
        	map.put(t, map.getOrDefault(t, 0)+1); 
        }
        //list에 key,value 같이 사용하는 방법
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        //(o1, o2)  list를 정렬하기 위한 비교 함수
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for(Map.Entry<Integer, Integer> entry : list) {
        	if(k <= 0) break;
        	answer++;
        	k -= entry.getValue();
        }
        return answer;
    }
}
