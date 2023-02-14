class Solution {
    public String solution(String[] seoul) {
        int search = 0;
        for(int i = 0 ; i < seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		search = i;
        	}
        }
        String answer = "김서방은 "+search+"에 있다";
        return answer;
    }
}