package lv0;

import java.util.Arrays;

class Lv0_017 {
    public static void  main(String[] args) {
      int[] numbers = {0, 31, 24, 10, 1, 9};
      System.out.println(solution(numbers));
    }
    //최댓값 만들기 (1)
    public static int solution(int[] numbers) {
      /*
       * 정수 배열 numbers가 매개변수로 주어집니다. 
       * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
       * solution 함수를 완성해주세요
       */
        int lng = numbers.length -1; //배열 길이 
        Arrays.sort(numbers); //배열 정렬
        int answer = numbers[lng] * numbers [lng-1];
          return answer;
    }
}