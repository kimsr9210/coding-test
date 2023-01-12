class Solution {
    public int solution(int n) {
        int answer = 0;
    	String [] arr = String.valueOf(n).split(""); 
        //n을 string으로 변환하여 하나식 잘라서 String 배열에 넣음
    	for(String a : arr) {
    		answer += Integer.parseInt(a); //숫자로 변환
    	}
        return answer;
    }
}