package codingTestSkills;

import java.util.HashMap;

public class Step1_3 {
	//예산
	public static void main(String[] args) {
		Step3_1 step3_2 = new Step3_1(); 

		int[] bell = {1, 2, 1, 1, 1, 2, 2, 1};
		step3_2.solution(bell);
	}
	
    public int solution(int[] bell) {
        int answer = 0;
        
        for(int i = 0; i < bell.length; i++) {
        	if(bell[i] == 2) bell[i] = -1;
        }
        
        int total = bell[0];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        hashMap.put(total, 0);
        
        for(int i = 1; i < bell.length; i++) {
        	total += bell[i];
        	if(!hashMap.containsKey(total)) {
        		hashMap.put(total,i);
        	}else {
        		answer = Math.max(answer, i - hashMap.get(total));
        	} 
        	
        }
        
        return answer;
	}
}
