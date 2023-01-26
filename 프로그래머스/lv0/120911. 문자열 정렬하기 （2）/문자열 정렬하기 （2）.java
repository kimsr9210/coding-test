import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String arr[] = new String [my_string.length()];
        my_string = my_string.toLowerCase(); //소문자로 변환
        arr = my_string.split(""); //배열에 넣음
        Arrays.sort(arr); //정렬
        for(String str : arr) {
        	answer += str;
        }
        return answer;
    }
}