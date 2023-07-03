class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patIdex = pat.length();
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            if(myString.substring(i,patIdex).contains(pat)) answer++;
            patIdex++;
        }
        return answer;
    }
}