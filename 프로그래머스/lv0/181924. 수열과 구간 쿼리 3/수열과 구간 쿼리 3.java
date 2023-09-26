class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone(); //배열복사
        for(int i = 0; i < queries.length; i++){
            int num1 = answer[queries[i][0]]; //i
            int num2 = answer[queries[i][1]]; //j
            answer[queries[i][0]] = num2;
            answer[queries[i][1]] = num1;
        }
        return answer;
    }
}
