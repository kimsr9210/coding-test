import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        
        ArrayList<Integer> arrayList = new ArrayList<>(); //Comparator
        for(int i = 0; i < emergency.length; i++) {
        	arrayList.add(emergency[i]);
        }
        
        arrayList.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < emergency.length; i++) {
        	int index = 0;
        	for(int j = 0; j < emergency.length; j++) {
        		if(emergency[i] == arrayList.get(index)) {
        			answer[i] = index+1;
        			break;
        		}
        		index++;
        	}
        }
        
        return answer;
    }
}