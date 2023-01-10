package lv0;

class Lv0_009 {
    public static void  main(String[] args) {
		int[] num_list = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(solution(num_list));
    }
    //짝수 홀수 개수
    public static int[] solution(int[] num_list) {
		/*
		 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
		 * solution 함수를 완성해보세요. (/ -> 일반적인 나누기 연산, % -> 나누기를 한 후 나머지를 구하는 연산 )
		 */
    	int[] answer = new int[2];
    	int odd  = 0 ; //홀수
    	int even = 0 ; //짝수
    	for(int a : num_list) {
    		if(a % 2 == 0) {
    			odd ++;
    		}else {
    			even ++;
    		}
    	}
    	answer[0] = odd;
    	answer[1] = even;
    	return answer;
    }
}