import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(n != 0) {
        	for(int i = 2; i <= n; i++) {
        		if(n % i == 0) {
        			n = n / i ;
        			if(!arrayList.contains(i)) arrayList.add(i);
        			if(n == 1) n = 0;
        			break;
        		}
        	}
        }
        
    	int[] answer = arrayList.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}