import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageFail = new int[N+2]; //현재 진행중인 스테이지
        int[] success = new int[N+1]; //스테이지를 성공한 플레이어 
        HashMap<Integer, Double> fail = new HashMap<>(); //실패율

        //현재 진행중인 스테이지 플레이어 카운트
        for(int s : stages) stageFail[s]++;
        
        //스테이지별 도달한 플레이어 카운트 수
        success[N] = stageFail[N] + stageFail[N+1];
        for(int i = N-1; i >= 1; i--) {
        	success[i] = stageFail[i] + success[i+1];
        }

        //실패율
        for(int i = 1; i < success.length; i++) {
        	//예외) 스테이지에 도달한 유저가 없는경우 실패율 0.0
        	if(success[i] == 0 || stageFail[i] == 0) {
        		fail.put(i,0.0);
        	}else {
        		fail.put(i,(double)stageFail[i] / success[i]);
        	}
        }

        ArrayList<Integer> list = new ArrayList<>(fail.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(fail.get(o2), fail.get(o1)));
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}