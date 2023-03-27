import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int n, String[] words) {
     	int[] answer = {};
        int cnt = 0;
		Map<String, Integer> map = new HashMap<>();
		
        answer = new int [2];
        int i = 0;
        for(; i < words.length;i++) {
            if(i == 0) {
                map.put(words[i], 1);
                cnt++;
            } else {
                if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || map.containsKey(words[i])) {
                    if(cnt >= n) {
                        cnt = cnt - n + 1;
                    } else {
                        cnt++;
                    }
                    
                    i++;
                    
                    answer[0] = cnt;
                    
                    if (i % n == 0) {
                        answer[1] = i / n;
                    } else {
                        answer[1] = i / n + 1;
                    }
                    
                    break;
                } else {
                    if(cnt >= n) {
                        cnt = cnt - n + 1;
                    } else {
                        cnt++;
                    }
                    map.put(words[i], 1);
                }
            }
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }
}