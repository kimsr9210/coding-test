class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length]; //길이만큼 생성
        int cnt = strlist.length;
        for(int i = 0; i < cnt; i++) {
        	answer[i] = strlist[i].length();
        }
        return answer;
    }
}