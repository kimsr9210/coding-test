class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //4자리 빼고 다 별로 바꾸기
        for(int i = 0; i < phone_number.length(); i++){
            char c = phone_number.charAt(i);
            if((phone_number.length() - 4) > i) {
                answer += '*';
            }else{
                answer += c;
            }
        }
        return answer;
    }
}