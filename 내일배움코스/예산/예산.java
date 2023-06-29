package codingTestSkills;

import java.util.Arrays;

public class Step1_3 {
	//예산(진행중(틀림))
	public static void main(String[] args) {
		Step1_3 step1_3 = new Step1_3(); 

		int[] budgets = {120, 110, 140, 150};
		int M = 485;
		step1_3.solution(budgets, M);
		
	}

    int answer = 0;
    int cnt = 0; //평균보다 작은 수 카운트
    public int solution(int[] budgets, int M) {
        Arrays.sort(budgets);

        int max = budgets[budgets.length-1]; //가장 큰수 150
        int avg = M / budgets.length; //평균 예산 121
        while(true) {
        	budget(budgets, avg, cnt, answer);
        	
        	System.out.println("avg : " + avg);
        	System.out.println("cnt : " + cnt);
        	System.out.println("max : " + max);
        	max -= 1; 
        	int sum = (max * cnt) + answer;
        	System.out.println("sum : " + sum);
        	if(sum < M) { //M = 485
        		
        		for(int i = 0; i < cnt; i++) {
        			if(budgets[i] > max) { //평균 예산 보다 크면
        	        	avg -= 1;
        				break;
        			}
        		}
        		answer = max;
        		System.out.println("answer :::::::::::::::::::::: " + answer);
        		return answer;
        	}
        }
    }
    
    public void budget (int[] budgets, int avg, int cnt, int answer) {
    	this.cnt = 0;
    	this.answer = 0;
        for(int b : budgets) {
        	if(avg < b) { 
        		this.cnt++;
        	}else {
        		this.answer+= b;
        	}
        }
    }
}
