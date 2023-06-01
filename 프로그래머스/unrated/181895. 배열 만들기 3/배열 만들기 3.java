import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int s = start; s <= end; s++){
                arrayList.add(arr[s]);
            }   
        }
        
        int[] answer = new int [arrayList.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}