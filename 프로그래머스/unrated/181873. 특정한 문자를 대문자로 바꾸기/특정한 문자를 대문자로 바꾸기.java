class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";////
        String[] str = my_string.split("");
        for(int i = 0; i < str.length; i++){
            answer += str[i].contains(alp) ? str[i].toUpperCase() : str[i];
        }
        return answer;
    }
}