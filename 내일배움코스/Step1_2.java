package codingTestSkills;

import java.util.Arrays;

public class Step1_2 {

	public static void main(String[] args) {
		Step1_2 step1_2 = new Step1_3(); 

		int[] numbers = {3, 30, 34, 5, 9};
		step1_2.solution(numbers);
		
	}

    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i = 0; i < str.length; i++) {
        	str[i] = String.valueOf(numbers[i]); //숫자를 문자형으로 변환해서 대입
        }
        
        //내림차순 정렬
        //람다표현식
        //문자열 b+a , a+b 를 비교하여 결과에 따라 순서를 결정
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        for(String s : str) {
        	answer += s;
        } 
        
        if(str[0].equals("0")) answer = "0";
        
        return answer;
    }
}
