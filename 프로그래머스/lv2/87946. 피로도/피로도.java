class Solution {
    static boolean[] visited;
    static int aser = 0;
    public int solution(int k, int[][] dungeons) {
        //유저가 탐험할수 있는 최대 던전 수를 return
    	visited = new boolean[dungeons.length]; //new false 
        return dfs(0, k, dungeons);
    }
    
        private int dfs(int depth, int k, int[][] dungeons) {
    	for(int i = 0; i < dungeons.length; i++) {
    		if(!visited[i] && dungeons[i][0] <= k) {
    			visited[i] = true; //방문으로 변경
    			dfs(depth+1, k - dungeons[i][1], dungeons); //1 60 배열 보냄
    			visited[i] = false;
    		}
    	}
    	aser = Math.max(aser, depth);
    	return aser;
    }
}