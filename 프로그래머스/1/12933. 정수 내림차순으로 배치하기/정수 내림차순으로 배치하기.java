import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split(""); //형변환 후 배열에 삽입
        Arrays.sort(str, Collections.reverseOrder()); //배열 내림차순 ex) 98765...
        
        String as = "";
        for(String s : str) {
        	as += s;
        }
        answer = Long.parseLong(as);
        return answer;
    }
}