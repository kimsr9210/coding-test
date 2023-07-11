package codingTestSkills;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

//위장
public class Step3_2 {
	public static void main(String[] args) {
		Step3_2 step3_1 = new Step3_2(); 

		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		//String[][] clothes = {{"crow_mast","face"},{"blue_sunglasses","face"},{"smoky_makeup","face"}};
		step3_1.solution(clothes);
		
	}

    public int solution(String[][] clothes) { //result = 5;
    	//각 종류별로 1가지 의상만 착용
    	//착용한 의상이 겹치더라도 다른의상이 겹치지 않거나 의상을 추가로 더 착용한 경우에는 다른 옷을 입은것으로 간주
    	//하루에 최소 한개의 의상은 입어야함
    	//같은 이름을 가진 의상은 존재하지 않음
    	//얼굴, 상의, 하의, 겉옷
    	int answer = 0;
    	for(int i = 0; i < clothes.length; i++) {
    		answer ++;
    		for(int j = 1; j < clothes[i].length; j++) {
    			System.out.println(clothes[i][j]);
    			if(clothes[i][j-1] != clothes[i][j]) answer++;
    		}
    	}
        System.out.println(answer);
        return answer;
    }
}