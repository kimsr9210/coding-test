import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
    	int num = k;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = k; i <= n; i++){
            if(i == num){
                arrayList.add(i);
                num += k;
            }
        }
        int[] answer = new int [arrayList.size()];
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}