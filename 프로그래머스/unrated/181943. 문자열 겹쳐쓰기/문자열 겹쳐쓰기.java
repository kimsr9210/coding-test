class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] str = my_string.split("");
        int index = 0;
        for(int i = s; i < overwrite_string.length()+s; i++) {
        	str[i] = String.valueOf(overwrite_string.charAt(index));
        	index++;
        }
        for(String a : str) {
        	answer += a;
        }
        return answer;
    }
}