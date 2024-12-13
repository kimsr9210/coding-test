import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        for(int a : arr){
            list.add(a);
            if(a <= min) min = a;
        }
        
        for(int i = 0; i < list.size(); i++){
            if(min == list.get(i)) list.remove(i);
        }
        
        int[] answer = new int [list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}