class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] bd = new int [board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                	bd[i][j] = 1;
                    if(i != 0){
                        bd[i-1][j] = 1;
                        if(j != 0) bd[i-1][j-1] = 1;
                        if(j != bd[i].length-1) bd[i-1][j+1] = 1;                      
                    }

                    if(j != 0) bd[i][j-1] = 1;
                    if(j != bd[i].length-1) bd[i][j+1] = 1;

                    if(i != bd.length-1){
                    	bd[i+1][j] = 1;
                        if(j != 0) bd[i+1][j-1] = 1;
                        if(j != bd[i].length-1) bd[i+1][j+1] = 1;                       
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(bd[i][j] == 0) answer++;
            }
        }        

        return answer;
    }
}
