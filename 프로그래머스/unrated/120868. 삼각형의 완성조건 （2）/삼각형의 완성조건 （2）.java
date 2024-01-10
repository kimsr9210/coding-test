import java.util.*;
class Solution {
    public int solution(int[] sides) {
    	/* 가장 긴변이 뭔지 모름
		 가장 긴변의 길이는 다른 두 합보다 작아야함
		 나머지 한변이 될수있는 정수의 "갯수"를 리턴*/
        int answer = 0;
        Arrays.sort(sides);

        //경우의 수 2가지
        //1.삼각형의 가장 긴변이 마지막 index일 경우
        int num = sides[1] - sides[0];
        answer = sides[1] - num;
        
        //2.삼각형의 가장 긴변이 없을경우
        num = sides[0] + sides[1]; // 18
        answer += (num-1) - sides[1];
        return answer;
    }
}