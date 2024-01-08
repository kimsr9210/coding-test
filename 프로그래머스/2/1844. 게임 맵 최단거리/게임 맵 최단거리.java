import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        int[][] locations = {{-1, 0},{1, 0},{0, -1,},{0, 1}}; //상하좌우
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1}); //시작위치, 칸의갯수

        while(!queue.isEmpty()){
            int[] location = queue.poll();
            int row = location[0];
            int col = location[1];
            int move = location[2];
            
            if(rows-1 == row && cols-1 == col) return move;
            
            for(int[] l : locations){
                int newRow = row + l[0];
                int newCol = col + l[1];
                if(newRow >= 0 &&
                   newRow < rows &&
                   newCol >= 0 &&
                   newCol < cols && 
                   maps[newRow][newCol] == 1
                  ){
                    maps[newRow][newCol] = 0;
                    queue.offer(new int[]{newRow, newCol, move+1}); 
                }
            }
        }
        return -1; // 목적지에 도달하지 못한 경우
    }
}