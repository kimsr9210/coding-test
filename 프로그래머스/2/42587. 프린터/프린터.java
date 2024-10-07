import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int p : priorities) {
        	queue.add(p);
        }

        while(!queue.isEmpty()) {
        	for(int i = 0; i < priorities.length; i++) {
        		if(priorities[i] == queue.peek()) { //peek() : 큐의 첫번째 요소를 제거하지 않고 반환
        			if(i == location) {
        				answer++;
        				return answer;
        			}
        			queue.poll(); //poll() : 큐의 첫번째 요소를 제거하고 제거된 요소를 반환
        			answer++;
        		}
        	}
        }
        return -1;
    }
}