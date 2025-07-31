import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        
        //�슦�꽑�닚�쐞 �걧 : �슦�꽑�닚�쐞媛� �넂�� �뜲�씠�꽣媛� 癒쇱� �굹媛��뒗 �삎�깭�쓽 �옄猷뚭뎄議�
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
        			if(num == -1) { //理쒖냼媛� �궘�젣 ㅅㄷㄴㅅ
        				min.poll();
        				max.clear();
        				max.addAll(min);
        			}
        			if(num == 1) { //理쒕�媛� �궘�젣 //////
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
