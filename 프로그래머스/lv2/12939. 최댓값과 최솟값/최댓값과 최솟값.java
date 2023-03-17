
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
		int[] str = {};
		str = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(str);
		int min = Math.min(str[0], str[str.length - 1]), max = Math.max(str[0], str[str.length - 1]);
		answer = min + " " + max;
        return answer;
    }
}