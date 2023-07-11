package codingTestSkills;

//게임 맵 최단거리
public class Step3_3 {
	public static void main(String[] args) {
		Step3_3 step3_3 = new Step3_3(); 

		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		//int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		step3_3.solution(maps);
		
	}

	//우선순위 : 아래, 오른쪽, 위
    public int solution(int[][] maps) {
        int answer = 0;
        
        if(maps[4][3] == 0 && maps[3][4] == 0) return -1;
 
        for(int i = 0; i < maps.length; i++) {
        	System.out.println("");
        	for(int j = 0; j < maps[i].length; j++) {
        		System.out.print(maps[i][j]);
        		if(maps[i][j] == 1) {
        			maps[i][j] = 0; //answer++ 방지하기 위해 1 => 0으로 바꾼다. 
        			answer++;
        		}else {
        			if(j > 2) {
        				i--; //위로 올라간다
        				j--;
        				if(maps[i][j] == 1) {
        					maps[i][j] = 0;
        					answer++;
        				}
        			}
        			break;
        		}
        	}
        }
        System.out.println("");
        System.out.println("answer : " + answer);
       
        
        return answer;
    }
}