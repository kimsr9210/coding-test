import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	ArrayList<Integer> arrayList = new ArrayList<>();
    	Queue<Integer> queue = new LinkedList<Integer>();
   
    	for(int i = 0; i <progresses.length; i++) {
    		queue.add((int)Math.ceil((100.0-progresses[i]) / speeds[i])); //Math.ceil() : 소수값이 존재할때 값을 올림
    	}

    	while(!queue.isEmpty()) {
    		//queue에서 꺼낸 값을 int형 변수 minDays에 저장
    		int minDays = queue.poll();  //poll() : 큐의 첫번째 요소를 제거하고 제거된 요소를 반환
    		int cnt = 1;
    		
    		while(!queue.isEmpty() && queue.peek() <= minDays) { //peek() : 큐의 첫번째 요소를 제거하지 않고 반환
    			queue.poll();
    			cnt++;
    		}
    		arrayList.add(cnt);
    	}
        
        //Java 8 이상일 경우 stream API를 사용
        //Integer list를 배열(array)로 변환
    	int[] answer = new int[arrayList.size()];
        answer = arrayList.stream().mapToInt(i -> i).toArray(); 
        
        return answer;
    }
}