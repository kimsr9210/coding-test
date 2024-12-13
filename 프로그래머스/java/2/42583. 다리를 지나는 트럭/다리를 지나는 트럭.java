import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        if(bridge_length == 1) return truck_weights.length+1;
        if(truck_weights.length == 1) return bridge_length+1;
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++){
            queue.offer(0);
        }
        
        int idx = 0;
        int truckWeight = 0; //현재 다리에 있는 트럭의 무게 
        while(idx < truck_weights.length){
            truckWeight -= queue.poll();
            answer++;
            
            if(truckWeight + truck_weights[idx] <= weight){
                queue.offer(truck_weights[idx]);
                truckWeight += truck_weights[idx++];
            }
            else queue.offer(0);
        }
        
        return answer + bridge_length;
    }
}