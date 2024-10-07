import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        while(n != 1){
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            arrayList.add(n);
        }
        int[] answer = new int [arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}