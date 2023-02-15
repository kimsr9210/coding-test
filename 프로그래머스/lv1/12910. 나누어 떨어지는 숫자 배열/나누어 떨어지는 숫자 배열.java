import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        Collections.sort(list); //컬렉션 정렬
        
        if(list.size() == 0) list.add(-1);
        
        //Java 8 이상일 경우 stream API를 사용
        //Integer list를 배열(array)로 변환
        answer = list.stream().mapToInt(i -> i).toArray(); 
        return answer;
    }
}