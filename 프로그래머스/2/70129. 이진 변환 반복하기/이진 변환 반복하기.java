class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int by = 0;
        int result = 0;
         while(!s.equals("1")){
             int size = s.length(); //s의 원래 길이
             s = s.replaceAll("0", "");
             by += size - s.length();
             int ss = s.length();
             s = Integer.toBinaryString(ss);
             result++;
         }
        answer[0] = result;
        answer[1] = by;
        return answer;
    }
}