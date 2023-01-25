import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
    	//음수와 양수 최대값을 만들어야 함.
    	int answer = 0;
    	Arrays.sort(numbers);
        int plus, minus ;
        plus = numbers[numbers.length-1] * numbers[numbers.length-2];
        minus = numbers[0] * numbers[1];
        answer = plus >  minus ? plus : minus;
        return answer;
    }
}