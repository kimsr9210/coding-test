class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [arr.length];
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0]; //0 1
            int end = queries[i][1] + 1; //1
            for(int a = start; a < end; a++){
                arr[a] = arr[a]+1;
            }
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}