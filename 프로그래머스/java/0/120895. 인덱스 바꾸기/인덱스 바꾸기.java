class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
       
        String str[] = new String[my_string.length()-1]; //배열 생성
        str = my_string.split(""); //문자열 잘라서 배열에 대입
        
        String str1 = str[num1];
        String str2 = str[num2];      
        str[num2] = str1;
        str[num1] = str2;
        for(String arr : str) {
        	answer += arr;
        }
        return answer;
    }
}