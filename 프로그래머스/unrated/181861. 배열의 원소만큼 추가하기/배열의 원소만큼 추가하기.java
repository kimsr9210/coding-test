import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int repeat = arr[i];
            for(int j = 0 ; j < repeat; j++){
                arrayList.add(repeat);
            }
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}