import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        //arr에서 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 값을 반환
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int a : arr){
            if(a % divisor == 0) arrayList.add(a);
        }
        
        Collections.sort(arrayList);
        
        if(arrayList.size() == 0){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int [arrayList.size()];
            answer = arrayList.stream().mapToInt(i -> i).toArray();
            return answer;
        }
    }
}