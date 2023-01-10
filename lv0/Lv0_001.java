package lv0;

class test01 {
    public static void  main(String[] args) {
        System.out.println(solution(15));
    }
    
    //짝수의 합
    public static int solution(int n) {
		//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
    	//+=  왼쪽의 변수에 오른쪽에 있는 값을 더한다.
    	int answer = 0;
    	for (int i = 2 ; i <= n ; i+=2   ) {
    		answer += i;
    	}
        return answer;
    }
}
