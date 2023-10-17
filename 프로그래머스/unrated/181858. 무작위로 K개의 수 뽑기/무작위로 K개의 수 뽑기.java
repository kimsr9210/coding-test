import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
        	if(arrayList.size() == k) break;
        	if(!arrayList.contains(arr[i])) arrayList.add(arr[i]);
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