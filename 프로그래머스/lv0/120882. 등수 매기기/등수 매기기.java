import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        
        System.out.println(Arrays.deepToString(score)); //2차원 배열 출력
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0 ; i < score.length; i++) {
        	arrayList.add(score[i][0] + score[i][1]);
        }

        arrayList.sort(Comparator.reverseOrder()); //내림차순 정렬

        for(int i = 0; i < score.length; i++) {
        	//indexOf() : 특정한 문자열의 index값을 리턴한다 
        	answer[i] = arrayList.indexOf(score[i][0] + score[i][1]) + 1; 
        }
        
        return answer;
    }
}