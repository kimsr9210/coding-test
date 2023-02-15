class Solution {
    public int solution(int[] numbers) {
    	//0...9를 총 합한 값은 45임 
    	//45 - 배열을 모두 더한 값 = result값
        int answer = 0;
        for(int n : numbers) {
        	answer += n;
        }
        answer = 45 - answer;
        return answer;
    }
}