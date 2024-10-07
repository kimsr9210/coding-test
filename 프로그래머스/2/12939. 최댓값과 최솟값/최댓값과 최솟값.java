class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        for(int i = 0; i < str.length; i++){
            min = Math.min(Integer.parseInt(str[i]), min);
            max = Math.max(Integer.parseInt(str[i]), max);
        }
        answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }
}