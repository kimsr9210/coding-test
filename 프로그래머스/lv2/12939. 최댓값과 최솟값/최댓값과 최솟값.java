
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); //공백을 기준으로 자르기
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
        	arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        answer += arr[0]+" ";
        answer += arr[arr.length-1];
        return answer;
    }
}