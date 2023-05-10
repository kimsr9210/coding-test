class Solution {
    public String solution(String my_string, int n) {
        int cut = my_string.length();
        String answer = my_string.substring(cut-n,cut);
        return answer;
    }
}