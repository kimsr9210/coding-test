class Solution {
    public int[] solution(String[] keyinput, int[] board) {
    	//board [width , high]
    	//result [좌우 , 위아래]
        int[] answer = { 0, 0 };
        int width = board[0] / 2 ;
        int height = board[1] / 2 ;
        for(String input : keyinput){
        	if(input.equals("up") && height > answer[1]) {
        		answer[1] += 1;
        	}else if(input.equals("down")  && -height < answer[1] ) {
        		answer[1] -= 1;
        	}else if(input.equals("left") && -width < answer[0]) {
        		answer[0] -= 1; 
        	}else if(input.equals("right") && width > answer[0]) {
        		answer[0] += 1;
        	}
        }
        return answer;
    }
}