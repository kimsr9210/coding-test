class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] c = phone_number.toCharArray(); //문자열을 한 글자씩 쪼개서 char 배열에 넣어줌
        for(int i = 0; i < c.length-4; i++) {
        	c[i] = '*';
        } 
        for(int i = 0; i < c.length; i++) {
        	answer += c[i];
        }
        
        //**다른 풀이 방법**
        //정규식 전방탐색
        //answer = phone_number.replaceAll(".(?=.{4})", "*");
        
        return answer;
    }
}
