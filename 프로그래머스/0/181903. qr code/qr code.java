class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            if(i % q == r) answer += c;
        }
        return answer;
    }
}
