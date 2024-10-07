import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
    	int lng = numbers.length -1; //배열 길이 
    	Arrays.sort(numbers); //배열 정렬
    	int answer = numbers[lng] * numbers [lng-1];
        return answer;
    }    
}