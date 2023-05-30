class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr = myString.split("");
        for(int i = 0; i < strArr.length; i++){
            String lower = strArr[i].toLowerCase();
            String upper = strArr[i].toUpperCase();
            answer += strArr[i].equals("a") 
                || strArr[i].equals("A") 
                ? upper : lower;
        }
        return answer;
    }
}