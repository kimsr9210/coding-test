import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        for(int dd : d){
            if(sum + dd <= budget){
                sum += dd;
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}
