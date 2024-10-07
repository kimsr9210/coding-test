class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String binary = "";
        
        //m명이 t번 말하는 경우까지 구함
        for(int i = 0; i <= m * t; i++) { //참가인원 * 미리 구할 갯수
        	binary  += Integer.toString(i, n);
        }
        //문자열은 0부터 이므로 p-1부터 
        //튜브가 말한것만 알면 되기 때문에 +m씩 증가
        for(int i = p - 1; i < m * t; i = i + m) {
        	answer += binary.charAt(i);
        }
        answer = answer.toUpperCase();
        return answer;
    }
}