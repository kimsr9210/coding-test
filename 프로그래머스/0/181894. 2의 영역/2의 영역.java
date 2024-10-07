import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = -1, end = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }

        if(start == -1){
            return new int[]{-1};
        }
        
        for(int i = start; i <= end; i++){
            arrayList.add(arr[i]);
        }

        int[] answer = new int [arrayList.size()];   
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}