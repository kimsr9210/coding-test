import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
    	int answer = 0;
    	int cnt = (score.length % m == 0 ) ? 0 : score.length % m;

    	Arrays.sort(score);

    	int arr[][] = new int [score.length / m][m]; //세로 , 가로
    	for(int i = 0; i < arr.length; i++) { //arr의 길이만큼
    		for(int j = 0; j < arr[i].length; j ++) {
    			arr[i][j] = score[cnt];
    			cnt++;
    		}
    	}

    	for(int i = 0; i < arr.length; i ++) {
    		answer += arr[i][0] * m * 1 ;
    	}
        return answer;
    }
}