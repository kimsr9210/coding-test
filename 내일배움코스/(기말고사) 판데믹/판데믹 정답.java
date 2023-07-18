package codingTestSkills;

import java.util.Arrays;

//판데믹(수정중)
public class Step4_1 {
	public static void main(String[] args) {
		Step4_1 step4_1 = new Step4_1(); 

		int rows = 3;
		int columns = 4;
		int max_virus = 2;
		int[][] queries = {{3,2},{3,2},{2,2},{3,2},{1,4},{3,2},{2,3},{3,1}};
		step4_1.solution(rows, columns, max_virus, queries);
		
	}
	
    public int[][] solution(int rows, int columns, int max_virus, int[][] queries) {
        int[][] answer = new int [rows][columns];
        
        System.out.println(-1 > 0);
        System.out.println(-1 < 0);
        
        for(int i = 0; i < queries.length; i++) {
        	int row = queries[i][0]-1;
        	int column = queries[i][1]-1;
        	//System.out.print(queries[i][0]);
        	//System.out.print(", ");
        	//System.out.println(queries[i][1]);
        	if(answer[row][column] == max_virus) { //현재 위치에서 상,하,좌 ,우 세균증식
            	System.out.println("현재 위치 row : " + row);
            	System.out.println("현재 위치 column : " + column);
        		int [][] arr = {{row-1,column},{row+1,column},{row,column-1},{row,column+1}};
        		System.out.println(Arrays.deepToString(arr));
        		
        		for(int j = 0; j < arr.length; j++) {
        			if(arr[j][0] < rows || arr[j][1] < column) { //값이 벗어나지 않으면
        				if(arr[j][0] > 0 || arr[j][1] > 0) {
            				System.out.println("값이 벗어나지 않으면");
            				if(answer[arr[j][0]][arr[j][1]] != max_virus) { //작으면
            					System.out.println("answer 현재값 : " + answer[arr[j][0]][arr[j][1]] );
            					answer[arr[j][0]][arr[j][1]] = answer[arr[j][0]][arr[j][1]]+1;
            					System.out.println("answer 더한값 : " + answer[arr[j][0]][arr[j][1]] );
            				}
        				}
        			}
        		}
        		

        		/*
        		answer[row-1][column] = answer[row-1][column]+1; //상
        		answer[row+1][column] = answer[row+1][column]+1; //하
        		answer[row][column-1] = answer[row+1][column]+1; //좌
        		answer[row][column+1] = answer[row+1][column]+1; //우
        		*/
        	}else {
        		answer[row][column] = answer[row][column]+1;
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	System.out.println("");
            for(int j = 0; j < answer[i].length; j++) {
            	System.out.print(answer[i][j]);
            	System.out.print(", ");
            }
        }
        System.out.println("여기왓어?");
        return answer;
    }
}
