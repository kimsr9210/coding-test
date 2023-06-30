package codingTestSkills;

import java.util.Arrays;

public class Step4_2 {
	//동전 뒤집기(코딩중)
	public static void main(String[] args) {
		Step4_2 step4_2 = new Step4_2(); 

		int[] coin = {1, 0, 1};
		int k = 3;
		step4_2.solution(coin, k);
		
	}
	
    public int solution(int[] coin, int k) {
    	//k갯수 만큼 동전을 뒤집을 수 있음 (한방향으로만)
    	//최소 책상을 내리쳐야 하는 횟수를 리턴
    	//만약, 모든 동전을 뒤집을 수 없다면 -1 리턴
        int answer = 0;
        int idex = 0;
        boolean match = false;
        while(coin.length - k > 0) {
        	for(int i = 0; i < k ; i++) {
        		if(coin[idex + 0] == 0) coin[idex + 1] = 1;
        		else coin[idex + 0] = 0;
        	}
        	answer++;
        	match = Arrays.stream(coin).allMatch(s -> s == coin[0]); //배열의 첫번째 요소와 같은지 확인
        	if(match) break; //모든 동전이 한방향인 경우 
        	idex++;
        }
        if(idex == 0) return -1; //모든 동전을 뒤집을 수 없다면
        return answer;
    }
}
