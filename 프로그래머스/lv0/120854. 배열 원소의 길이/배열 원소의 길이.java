class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        int idex = 0;
        for(String s : strlist){
            answer[idex] = s.length();
            idex++;
        }
        return answer;
    }
}