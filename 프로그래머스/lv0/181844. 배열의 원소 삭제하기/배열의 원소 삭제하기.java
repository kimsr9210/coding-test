import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> addList = new ArrayList<>();
        
        for(int d : delete_list) arrayList.add(d);

        for(int a : arr){
            if(!arrayList.contains(a)) addList.add(a);
        }
        
        int[] answer = new int [addList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = addList.get(i);
        }
        return answer;
    }
}