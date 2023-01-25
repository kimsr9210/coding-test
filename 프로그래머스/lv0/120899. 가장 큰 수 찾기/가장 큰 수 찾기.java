import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] arr = array.clone(); //배열 복사
        int last = arr.length-1; //배열의 길이
        Arrays.sort(arr); ///오름차순으로 정렬
        for(int i = 0; i < arr.length; i++) {
        	if(array[i] == arr[last]) {
        		answer[0] = arr[last];
        		answer[1] = i;
        	}
        }
        return answer;
    }
}