import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
		 Arrays.sort(array); //배열 오름차순 정렬
		 int answer = array[array.length / 2];
        return answer;
    }
}