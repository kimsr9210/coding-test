import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        //players : 선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열
        //callings : 해설진이 부른 이름을 담은 문자열 배열 
        //경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담기
        String[] answer = new String [players.length];
        HashMap<String,Integer> copyPlayers = new HashMap<>(); //선수들이름
        HashMap<Integer,String> seqHashMap = new HashMap<>(); //선수들 순위
        for(int i = 0; i < players.length; i++) {
           	copyPlayers.put(players[i],i);
           	seqHashMap.put(i,players[i]);
        }
        for(int i = 0 ; i < callings.length; i++) {
        	String player = callings[i]; //이름
        	int seq = copyPlayers.get(player);
       
        	//추월당한 사람
        	String front = seqHashMap.get(seq-1);
        	copyPlayers.put(front, seq);
        	seqHashMap.put(seq,front);
        	
        	//추월한 사람
        	copyPlayers.put(player, seq-1);
        	seqHashMap.put(seq-1, player);
        }
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = seqHashMap.get(i);
        }
        return answer;
    }
}