class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int before = 0; //0이 제거되기 전 길이 
        int after = 0; //s의 현재 길이
        while(!s.equals("1")){
            before = s.length();
            s = s.replaceAll("0",""); //0제거
            after = s.length();
            answer[1] += before - after;
            s = Integer.toBinaryString(after);
            answer[0] = answer[0] + 1; 
        }
        return answer;
    }
}