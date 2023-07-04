package codingTestSkills;

import java.util.Arrays;

public class Step2_2 {

	public static void main(String[] args) {
		Step2_2 step2_2 = new Step1_3(); 

		int[] people = {1, 2, 3, 4, 6}; //참가자의 상의 크기
		int[] tshirts = {1, 1, 1, 6}; //주최가 가진 티셔츠 크기
		step2_2.solution(people, tshirts);
		
	}

    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < tshirts.length; i++) {
        	int value = 1;
        	if(hashMap.containsKey(tshirts[i])) value = hashMap.get(tshirts[i]) + 1;
        	hashMap.put(tshirts[i], value);
        }
        System.out.println(hashMap);
        for(int i = 0; i < people.length; i++) {
        	//티셔츠의 사이즈가 있으면서, 재고가 0이 아닐때
        	if(hashMap.containsKey(people[i]) && hashMap.get(people[i]) > 0) { 
        		hashMap.put(people[i], hashMap.get(people[i])-1);
        		answer++;
        	}
        }
        System.out.println(hashMap);
        System.out.println(answer);
        return answer;
    }

}
