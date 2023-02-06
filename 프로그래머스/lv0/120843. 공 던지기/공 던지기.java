class Solution {
    public int solution(int[] numbers, int k) {
        //반복되는 순서를 먼저 찾기
        int answer = numbers[2 * (k -1) % numbers.length];
        return answer;
    }
}