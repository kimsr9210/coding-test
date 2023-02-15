import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
    	//arr 에서 가장 작은 수를 제거한 배열을 리턴
    	//배열이 빈 배열인 경우엔 배열에 -1 리턴
        int[] answer = {};
        int[] copy = arr.clone(); //배열 복사
        Arrays.sort(copy); //배열 정렬
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(arr.length == 1) {
        	arrayList.add(-1);
        }else {
            for(int i = 0; i < arr.length; i++) {
            	if(arr[i] != copy[0]) arrayList.add(arr[i]);
            }	
        }
        //Integer list를 배열(array)로 변환
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}