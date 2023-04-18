import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //커밋 왜안되는거지 ??? 
        int[] answer = new int [commands.length];
        int answerIndex = 0;

        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
        	ArrayList<Integer> arrayList = new ArrayList<>();
        	
            for(int a = start; a <= end; a++) {
            	arrayList.add(array[a]);    	
            }
            
        	Collections.sort(arrayList); //리스트 정렬

        	int index = 0;
        	for(int a : arrayList) {
        		if(index == commands[i][2]-1) {
        			answer[answerIndex] = a;
        			answerIndex++;
        		}
    			index++;
        	}
        }
        return answer;
    }
}