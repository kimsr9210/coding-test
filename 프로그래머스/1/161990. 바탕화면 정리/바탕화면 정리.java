class Solution {
    public int[] solution(String[] wallpaper) {
    	int[] answer = new int [4];
    	int lux = Integer.MAX_VALUE; //제일위 2147483647
    	int luy = Integer.MAX_VALUE;//제일왼쪽
    	int rdy = Integer.MIN_VALUE;//제일오른쪽 -2147483648
    	int rdx = Integer.MIN_VALUE;//제일아래
        for(int x = 0; x < wallpaper.length; x++) {
        	for(int y = 0; y < wallpaper[x].length(); y++) {
        		if(wallpaper[x].charAt(y) == '#') {
        			lux = Math.min(lux, x);
        			luy = Math.min(luy, y);
        			rdy = Math.max(rdy, x);
        			rdx = Math.max(rdx, y);
        					
        		}
        	}
        }
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdy+1;
        answer[3] = rdx+1;
        return answer;
    }
}