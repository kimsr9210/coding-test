import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < lottos.length; i++) {
        	arrayList.add(win_nums[i]);
        	if(lottos[i] == 0) zero++;
        	if(lottos[i] != 0) arrayList.add(lottos[i]);
        }

        HashSet<Integer> hashSet = new HashSet<>(arrayList); //중복제거

        answer[0] = 12 - hashSet.size();
        answer[1] = (12 - hashSet.size()) - zero;

        for(int i = 0; i < answer.length; i++) {
        	switch(answer[i]) {
        	case 6 : answer[i] = 1;
			         break;     
        	case 5 : answer[i] = 2;
			         break;     
        	case 4 : answer[i] = 3;
        			 break;     
        	case 3 : answer[i] = 4;
        			 break;     	
        	case 2 : answer[i] = 5;
			  		 break;
        	default : answer[i] = 6; 
        			  break;
        	}
        }
        return answer;
    }
}
