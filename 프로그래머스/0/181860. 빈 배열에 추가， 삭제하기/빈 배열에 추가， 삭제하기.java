import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i] * 2; j++){
                    arrayList.add(arr[i]);
                }
            }else{
                for(int j = 0; j < arr[i]; j++){
                    arrayList.remove(arrayList.size()-1);
                }
            }
        }

        int[] answer = new int [arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}