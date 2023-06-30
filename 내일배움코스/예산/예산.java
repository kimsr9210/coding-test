package codingTestSkills;

import java.util.stream.IntStream;

public class Step1_3 {
	//예산
	public static void main(String[] args) {
		Step1_3 step1_3 = new Step1_3(); 

		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		step1_3.solution(budgets, M);
		
	}
	
	public int solution(int[] budgets, int M) {
		//최소값, 최대값 ,중간값 구하기
		int answer = 0;
		int min = 0; //최소값
		int max = IntStream.of(budgets).max().orElse(0); // //높은 값이 없다면 0을 반환
		
		while(min <= max) {
			int mid = (min + max) / 2; //중간값
			
			int sum = 0;
			for(int b : budgets) {
				if(b > mid) sum += mid;
				else sum += b;
			}
			
			if(sum <= M) {
				min = mid + 1;
				answer = mid;
			}else {
				max = mid - 1;
			}
		}
		return answer ;
	}
}
