package codingTestSkills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


//중간고사 1. 상담예약제

public class Step2_1 {

	public static void main(String[] args) {
		Step2_1 step2_1 = new Step2_1(); 

		//String[][] booked = {{"09:10","lee"},{"12:10","kim"}};
		String[][] booked = {{"09:10","lee"}};
		String[][] unbooked = {{"09:00","kim"},{"14:07","bae"}};
		
		//String[][] booked = {{"09:55","hae"}, {"10:05","jee"}};
		//String[][] unbooked = {{"10:04","hee"},{"14:07","eom"}};
		step2_1.solution(booked, unbooked);
		
	}

    public String[] solution(String[][] booked, String[][] unbooked) {        
    	String[] answer = new String [booked.length + unbooked.length]; //3개
    	
    	HashMap<Integer, String> hashMap = new HashMap<>();
    	ArrayList<Integer> arrayList = new ArrayList<>();
    	
    	for(int i = 0; i < booked.length; i++) {
    		int time = Integer.parseInt(booked[i][0].substring(0,2) + booked[i][0].substring(3,5)); 
    		hashMap.put(time, booked[i][1]);
    		arrayList.add(time);
    	}

    	for(int i = 0; i < unbooked.length; i++) {
    		int time = Integer.parseInt(unbooked[i][0].substring(0,2) + unbooked[i][0].substring(3,5)); 
    		hashMap.put(time, unbooked[i][1]);
    		arrayList.add(time);
    	}
    	
    	Collections.sort(arrayList); 
 
    	for(int i = 0; i < answer.length; i++) { 
    		answer[i] = hashMap.get(arrayList.get(i)); 
    		System.out.println(answer[i]);
    	}
        return answer;
    }
}
