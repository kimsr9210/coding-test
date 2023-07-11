package codingTestSkills;

import java.util.*;

//행운의 편지
public class Step3_2 {
	public static void main(String[] args) {
		Step3_2 step3_1 = new Step3_2(); 

		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		//String[][] clothes = {{"crow_mast","face"},{"blue_sunglasses","face"},{"smoky_makeup","face"}};
		step3_1.solution(clothes);
    }

    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<Integer, Integer> receive = new HashMap<>(); //악동주민이 보낸 행운의 편지를 받은사람
        
        //악동주민이 일반 주민에게 보낸 행운의 편지
        for(int i = 0; i < contact.length; i++){
        	if(contact[i][0] <= c) {
                int key = contact[i][1];
                receive.put(key, receive.getOrDefault(key,0)+1);
        	}
        }

        for(int i = 0; i < contact.length; i++){
        	if(contact[i][0] > c) {
            	int key = contact[i][0];
            	if(receive.containsKey(key)) {
            		int value = receive.get(key);
            		if(value >= k) {
            			receive.put(contact[i][1],receive.getOrDefault(contact[i][1], 0)+1);
            		}
            	    }
        	}
        }
        answer = (n - c) - receive.size();
        return answer;
    }
}
