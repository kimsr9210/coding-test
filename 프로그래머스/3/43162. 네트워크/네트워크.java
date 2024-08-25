class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n]; //기본값 false
        for(int i = 0; i < check.length; i++) {
        	if(!check[i]) {
        		dfs(computers, check, i);
        		answer++;
        	}
        }

        return answer;
    }
    
    void dfs(int[][] computers, boolean[] check, int i) {
    	check[i] = true;
    	for(int j = 0; j < computers.length; j++) {
    		if(computers[i][j] == 1 && !check[j]) {
    			dfs(computers, check, j);
    		}
    	}
    }
}