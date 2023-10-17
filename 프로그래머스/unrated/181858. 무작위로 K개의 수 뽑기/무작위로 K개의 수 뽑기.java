import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int a : arr) {
        	if(arrayList.size() == k) break;
        	if(!arrayList.contains(a)) arrayList.add(a);
        }

        if(arrayList.size() < k) {
        	for(int i = arrayList.size(); i < k; i++) {
        		arrayList.add(-1);
        	}
        }
        
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}