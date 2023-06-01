class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int add = 0;
                if(i == j) add = 1;
                answer[i][j] = add;
            }
        }
        return answer;
    }
}