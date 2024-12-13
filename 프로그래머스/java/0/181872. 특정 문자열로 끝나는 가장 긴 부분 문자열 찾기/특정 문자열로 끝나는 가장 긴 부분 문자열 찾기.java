class Solution {
    public String solution(String myString, String pat) {
        int size = pat.length();
        String answer = myString.substring(0, myString.lastIndexOf(pat)+size);
        return answer;
    }
}