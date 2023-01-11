import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int result = 0; 
    	Arrays.parallelSort(sides);
    	answer = (result = sides[0] + sides[1] > sides[2] ? 1 : 2 );
        return answer;
    }
}