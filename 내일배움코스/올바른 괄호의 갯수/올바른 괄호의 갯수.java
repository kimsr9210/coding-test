package codingTestSkills;

import java.util.Stack;

//올바른 괄호의 갯수
public class Step3_7 {
	public static void main(String[] args) {
		Step3_7 step3_7 = new Step3_7(); 

		int n = 2;
		step3_7.solution(n);
		
	}
	
	//생성자
	class P {
		int open, close;
		P(int open, int close){
			this.open = open;
			this.close = close;
		}
	}
	
    public int solution(int n) {
        int answer = 0;
        
        Stack<P> stack = new Stack<>(); 
        stack.push(new P (0,0)); //시작값
        
        while(!stack.isEmpty()) { //stack이 비었을때 까지 반복
        	P p = stack.pop(); //꺼냄
        	
        	////종료조건
        	if(p.open > n) continue;
        	if(p.open < p.close) continue;
        	if(p.open + p.close == 2 * n) {
        		answer++;
        		continue;
        	}
        	
        	//다음 케이스에 대해서 스택에 집어넣어줌
        	stack.push(new P(p.open+1, p.close)); 
        	stack.push(new P(p.open, p.close+1));
        }
        return answer;
    }
}
