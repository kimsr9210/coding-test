class Solution {
    public int solution(int n) {
        int answer = (int) Math.ceil((double)n/7); //Math.ceil() 소수값이 존재할때 올림
        return answer;
    }
}
