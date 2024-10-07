class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n];
        int count = 0;
        for(int i = 0; i < num_list.length/n; i++) { //배열 길이 / n 만큼 반복
        	for(int j = 0 ; j < n; j ++) {
        		answer[i][j] = num_list[count];
        		count++;
        	}
        }
        return answer;
    }
}