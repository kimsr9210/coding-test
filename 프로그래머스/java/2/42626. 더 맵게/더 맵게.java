import java.util.Queue;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;       
        Queue<Integer> q = new PriorityQueue<>(); //우선순위가 높은 데이터가 가장 먼저 나옴
        for(int s : scoville) q.add(s);

        //q.peek() //원소 꺼냄
        //q.poll() //원소 꺼내고 삭제
        while(q.peek() < K) {
        	if(q.peek() < K &&  q.size() == 1) return answer = -1;
        	q.add(q.poll() + (q.poll() * 2));
        	answer++;
        }
        return answer;
    }
}
