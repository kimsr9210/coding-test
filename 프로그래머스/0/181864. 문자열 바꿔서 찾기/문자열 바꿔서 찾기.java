class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] strArr = myString.split("");
        String str = "";
        for(int i = 0; i < strArr.length; i++){
            str += strArr[i].equals("A") ? "B" : "A";
        }
        if(str.contains(pat)) answer = 1;
        return answer;
    }
}