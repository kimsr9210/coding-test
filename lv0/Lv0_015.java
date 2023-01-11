package lv0;

import java.util.Arrays;

class Lv0_015 {
    public static void  main(String[] args) {
		int[] numbers = {0,1,2,3,4,5,6};
		int num1 = 0; 
		int num2 = 2;
        System.out.println(solution(numbers, num1, num2));
    }
    //배열 자르기
    public static int[] solution(int[] numbers, int num1, int num2) {
		/*
		 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
		 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 
		 * return 하도록 solution 함수를 완성해보세요
		 */

    	//int[] numbers = {0,1,2,3,4,5,6};
    	//복사할 배열, 복사 시작 인덱스, 복사 끝 인덱스(-1) - 즉, 0~2까지 1,2,3을 복사
    	int [] answer = Arrays.copyOfRange(numbers, 0, 1+1);
        return answer;
    }
}