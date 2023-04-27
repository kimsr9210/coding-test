class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int [(end-start)+1];
        int idex = 0;
        for(int i = start; i <= end; i++){
            answer[idex] = i;
            idex++;
        }
        return answer;
    }
}