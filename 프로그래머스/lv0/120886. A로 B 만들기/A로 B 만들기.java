import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int cnt = 0;
        String [] b = before.split("");
        String [] a = after.split("");
        Arrays.sort(b);
        Arrays.sort(a);
        for(int i = 0; i < b.length; i++) {
        	if(b[i].equals(a[i])) {
        		cnt++;
        	}
        }
        answer = (after.length() == cnt) ? 1 : 0;
        return answer;

    }
}