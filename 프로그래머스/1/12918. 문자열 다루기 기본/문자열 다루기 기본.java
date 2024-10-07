class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String number = s.replaceAll("[^0-9]", "");
        if(s.length() != 4 && s.length() != 6) answer = false; //모두 참일때 false
        if(number.length() != s.length()) answer = false;
        return answer;
    }
}