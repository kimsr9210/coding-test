class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0}; //변환 횟수, 제거한 0의 갯수
        while(!s.equals("1")){
            int c = s.length(); //s의 길이 
            String x = s.replaceAll("0", ""); //0제거
            s = Integer.toBinaryString(x.length());
            answer[1] += c - x.length();
            answer[0] = answer[0]+1;
        }
        return answer;
    }
}