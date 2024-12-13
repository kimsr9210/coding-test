class Solution {
    public int solution(int[][] sizes) {
        int left = 0;
        int right = 0;
        for(int card[] : sizes){
            left = Math.max(left, Math.max(card[0],card[1]));
            right = Math.max(right, Math.min(card[0],card[1]));
        }
        int answer = left * right;
        return answer;
    }
}