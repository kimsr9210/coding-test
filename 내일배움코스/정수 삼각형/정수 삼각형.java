package codingTestSkills;

//정수 삼각형
public class Step3_6 {
	public static void main(String[] args) {
		Step3_6 step3_6 = new Step3_6(); 

		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}; //30
		step3_6.solution(triangle);
		
	}
	//[위에서부터 아래로 돌아가는 로직]
	//문제를 잘게 잘라서 왼쪽, 오른쪽에서 오는 값이 더 큰지 더해서 진행
	//1번째 index 부터 루프 시작 
	//i 위에서부터 몇번째 j 한줄에서부터 몇번째인지 
	//왼쪽과 오른쪽값중에 큰 값을 대체해 넣음 
	//끝에있는 경우 오른쪽 왼쪽중 하나만 있는 경우 조건 만들기
	
	//[아래에서 부터 위로 돌아가는 로직]
	//아래에서부터 왼쪽,오른쪽 삼각형을 만들어서 더 큰수를 구한다.
	//아래에서부터 올라가기 때문에 끝에있는 경우(숫자가 없을경우) 조건을 안 만들어도 된다.
    public int solution(int[][] triangle) {
        for(int i = triangle.length-2; i >= 0; i--) {
        	for(int j = 1; j < triangle[i].length; j++) {
        		int left = triangle[i][j] + triangle[i+1][j];
        		int right = triangle[i][j] + triangle[i+1][j+1];
        		triangle[i][j] = Math.max(left, right);
        	}
        }
        return triangle[0][0];
    }
}
