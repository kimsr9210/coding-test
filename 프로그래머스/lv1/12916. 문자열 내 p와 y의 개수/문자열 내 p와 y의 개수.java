class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String result = s.toUpperCase(); //대문자로 변환
        String p  = result.replaceAll("[^P]",""); //P제외하고 공백으로 치완
        String y  = result.replaceAll("[^Y]",""); //P제외하고 공백으로 치완
        if(p.length() != y.length()) answer = false;
        return answer;
    }
}