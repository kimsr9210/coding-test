class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int [arr.length];
        int idex = 0;
        for(int a : arr){
            answer[idex] = (k % 2 == 0) ? a + k : a * k;
            idex++;
        }
        return answer;
    }
}