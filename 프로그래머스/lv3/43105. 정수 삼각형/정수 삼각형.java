class Solution {
    public int solutionEx1(int[][] triangle) {
        for(int i = triangle.length-1; i > 0; i--) {
        	for(int j = 0; j < triangle[i].length-1; j++) {
        		int left = triangle[i-1][j] + triangle[i][j];
        		int right = triangle[i-1][j] + triangle[i][j+1];
        		triangle[i-1][j] = Math.max(left, right);
        	}
        }
        return triangle[0][0];
    }

    public int solutionEx2(int[][] triangle) {
        int answer = 0;
        for(int i = 1; i < triangle.length; i++) {
        	for(int j = 0; j < triangle[i].length; j++) {
        		if(j == 0) { //왼쪽 끝
        			triangle[i][j] += triangle[i-1][j];
        		}else if(j == i) { //오른쪽 끝
        			triangle[i][j] += triangle[i-1][j-1];
        		}else {
        			triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
        		}
        		
        		answer = Math.max(answer, triangle[i][j]);
        	}
        }
        return answer;
    }
}