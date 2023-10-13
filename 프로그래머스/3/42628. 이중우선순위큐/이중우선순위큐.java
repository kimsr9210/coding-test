import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        
        //우선순위 큐 : 우선순위가 높은 데이터가 먼저 나가는 형태의 자료구조
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < operations.length; i++) {
        	String math = operations[i].substring(0,1);
        	int num = Integer.parseInt(operations[i].substring(2,operations[i].length()));

        	switch(math) {
        		case "I" : 
        			min.add(num);
        			max.add(num);
        			break;
        		case "D" :
        			if(num == -1) { //최소값 삭제
        				min.poll();
        				max.clear();
        				max.addAll(min);
        			}
        			if(num == 1) { //최대값 삭제
        				max.poll();
        				min.clear();
        				min.addAll(max);
        			}
        			break;
        	}
        }

        if(min.size() > 0 && max.size() > 0) {
        	answer[0] = max.poll();
            answer[1] = min.poll();
        }
        
        return answer;
    }
}