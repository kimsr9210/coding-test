class Solution {
    public int solution(int n) {
    	//Integer.bitCount()
    	//파라미터에 int형 정수가 들어갔을때
    	//정수의 이진수 ex)13 => 1101에서 1의 개수인 3을 리턴 해준다.
        int answer = Integer.bitCount(n); //이진수에서 1의 개수를 세어주는 함수
        while(true) {
        	n++;
        	if(answer == Integer.bitCount(n)) {
        		answer = n;
        		return answer;
        	}
        }     
    }
}