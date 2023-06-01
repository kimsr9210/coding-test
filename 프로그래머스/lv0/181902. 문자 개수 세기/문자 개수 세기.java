class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int [52]; //알파벳 개수
        for(int i = 0; i < my_string.length(); i++){
            int idex = my_string.charAt(i);
            idex -= idex <= 90 ? 65 : 71;
            answer[idex] = answer[idex]+1;
        }
        return answer;
    }
}