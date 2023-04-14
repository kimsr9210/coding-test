class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        int idex = 0;
        for(int n : numbers){
            answer[idex] = n * 2;
            idex++;
        }
        return answer;
    }
}