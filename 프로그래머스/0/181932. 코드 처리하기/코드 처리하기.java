class Solution {
    public String solution(String code) {
        String answer = "";
        int made = 0;
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            if(made == 0){
                if(c != '1'){
                    if(i % 2 == 0) answer += c;
                }else{
                   made = 1; 
                }
            }else{ 
                if(c != '1'){
                    if(i % 2 == 1) answer += c;
                }else{
                    made = 0;
                }
            }
        }
        if(answer.length() == 0) answer = "EMPTY";
        return answer;
    }
}