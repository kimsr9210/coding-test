class Solution {
    public int solution(int[][] triangle) {
        for(int i = triangle.length-1; i > 0; i--) {
        	for(int j = 0; j < triangle[i].length-1; j++) {
        		int left = triangle[i-1][j] + triangle[i][j];
        		int right = triangle[i-1][j] + triangle[i][j+1];
        		triangle[i-1][j] = Math.max(left, right);
        	}
        }
        return triangle[0][0];
    }
}