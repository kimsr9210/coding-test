import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {

        ArrayList<Integer> arrayList  = new ArrayList<>();
        for(int i = 0; i < num_list.length; i+=n){
            arrayList.add(num_list[i]);
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}