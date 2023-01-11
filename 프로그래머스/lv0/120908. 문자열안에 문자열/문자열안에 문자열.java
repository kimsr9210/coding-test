class Solution {
    public int solution(String str1, String str2) {
    	boolean chk = true ; 
    	int answer = (chk == str1.contains(str2) ? 1 : 2);
        return answer;
    }
}