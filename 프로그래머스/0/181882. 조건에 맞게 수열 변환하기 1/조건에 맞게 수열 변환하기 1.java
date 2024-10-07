import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                arrayList.add(arr[i] / 2);
            }else if(arr[i] < 50 && arr[i] % 2 != 0){
                arrayList.add(arr[i] * 2); 
            }else{
                arrayList.add(arr[i]);
            }
        }
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}