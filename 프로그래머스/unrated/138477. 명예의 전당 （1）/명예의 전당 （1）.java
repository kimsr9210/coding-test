import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        //queue로 풀었을때
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++) {
            
            queue.add(score[i]);
        
            if(queue.size() <= k) {
                answer[i] = queue.peek();
            }else {
                queue.remove();
                answer[i] = queue.peek();
            }
        }

        //Arraylist로 풀었을때 
        /*
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
    
            if(i < k){
                arrayList.add(score[i]);
                arrayList.sort(Collections.reverseOrder());
                answer[i] = arrayList.get(arrayList.size()-1);
            }
            
            if(i >= k){
                //k번째 가수 점수보다 더 높으면
                if(arrayList.get(k-1) < score[i]){
                    arrayList.remove(k-1);
                    arrayList.add(score[i]);
                }
                arrayList.sort(Collections.reverseOrder());
                answer[i] = arrayList.get(k-1);
            }
        }*/
        return answer;
    }
}
