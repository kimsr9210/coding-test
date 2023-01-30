import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 0;
        int max = 0;
        
        Arrays.sort(array);
        
        for(int i = 0 ; i < array.length-1; i++) {
        	if(array[i] <= n) {
        		min = array[i];
        		max = array[i+1];
        	}
        }
        answer = (n - min) > (max - n) ? max : min;
        if((n - min) == (max - n)) {
        	answer = min;
        }
        
        return answer;
    }
}