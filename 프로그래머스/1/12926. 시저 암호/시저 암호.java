class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i); //하나씩 쪼개서 대입한다.

        	if(Character.isLowerCase(c)) { //입력받은 인자 소문자 여부 확인
        		c = (char)((c - 'a' + n) % 26 + 'a');
        	}else if(Character.isUpperCase(c)) {
        		c = (char)((c - 'A' + n) % 26 + 'A');
        	}
        	answer += c;
        }
        return answer;
    }
}