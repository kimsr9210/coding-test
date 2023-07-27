class Solution {
    public String[] solution(String my_string) {
    	//.trim() 왼쪽, 오른쪽 공백 제거
    	//.split("[ ]+") 문자열을 공백 문자(스페이스)를 기준으로 분할, + 여러번 반복        
        String[] answer = my_string.trim().split("[ ]+");
        return answer;
    }
}
