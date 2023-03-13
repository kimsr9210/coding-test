class Solution {
    public int[] solution(String s) {
    	//반복 순서
    	//1. s에서 0을 제거한다.
    	//2. s의 길이에서 2진 변환을 한다.
    	//3. 1이 될때 까지 반복한다
    	//4. 1이 되면 {변환된 횟수, 제거한 0의 갯수}를 리턴 한다.
    	int answer[] = new int [2];
    	int cnt = 0; //변환된 횟수
    	int remove = 0; //제거한 0의 갯수 
    	while(!s.equals("1")) { 
    		int oldLength = s.length(); 
    		s = s.replaceAll("0",""); //0제거
    		int newLength  = s.length(); //현재 s의 길이
    		remove += oldLength - newLength ;
        	s = Integer.toBinaryString(newLength); //2진수 변환
        	cnt++;
    	}
    	answer[0] = cnt;
    	answer[1] = remove;
        return answer;
    }
}