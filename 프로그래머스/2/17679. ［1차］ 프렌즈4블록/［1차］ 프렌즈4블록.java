class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        char[][] map = new char[m][n];
        for(int i = 0; i < m; i++) map[i] = board[i].toCharArray();
        
        int answerBefor = -1;
        boolean[][] isChecked = new boolean[m][n]; 
        while(true){
            if(answer == answerBefor) break;
            answerBefor = answer;
            
            //모양이 같은 블록 찾음
            for(int i = 0; i < m-1; i++){
                for(int j = 0; j < n-1; j++){
                    if(map[i][j] != ' ' &&
                       map[i][j] == map[i][j+1] &&
                       map[i][j] == map[i+1][j] &&
                       map[i][j] == map[i+1][j+1]
                    ){
                        isChecked[i][j] = true;
                        isChecked[i][j+1] = true;
                        isChecked[i+1][j] = true;
                        isChecked[i+1][j+1] = true;
                    }
                }
            }
            
            //삭제된 갯수 체크
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(isChecked[i][j]){
                        map[i][j] = ' ';
                        answer++;
                        isChecked[i][j] = false;
                    }
                }
            }
            
            //블록 교환
            for(int i = 0; i < m; i++){
                for(int ii = m-1; ii > 0; ii--){
                    for(int jj = 0; jj < n; jj++){
                        if(map[ii][jj] == ' '){
                            map[ii][jj] = map[ii-1][jj];
                            map[ii-1][jj] =  ' ';
                        }
                    }
                }
            }
        }

        return answer;
    }
}