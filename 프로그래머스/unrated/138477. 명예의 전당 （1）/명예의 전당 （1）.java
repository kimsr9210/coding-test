import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            if(i < k){
                arrayList.add(score[i]);
                arrayList.sort(Collections.reverseOrder());
                answer[i] = arrayList.get(arrayList.size()-1);
            }else{
                //k번째 가수 점수보다 더 높으면
                if(arrayList.get(k-1) < score[i]){
                    arrayList.remove(k-1);
                    arrayList.add(score[i]);
                }
                arrayList.sort(Collections.reverseOrder());
                answer[i] = arrayList.get(k-1);
            }
        }
        return answer;
    }
}