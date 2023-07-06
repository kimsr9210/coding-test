import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        //등수가 높은 순으로 3명의 학생 선발
        //참여가 가능한 학생만
        //정렬 해줘야함 HashMap -> TreeMap으로 변경
        int answer = 0;
        TreeMap<Integer, Integer> treehMap = new TreeMap<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i] == true) treehMap.put(rank[i], i); 
        }
        
        int idex = 0;
        int arr[] = new int [3];
        for(int t : treehMap.keySet()){
            arr[idex] = treehMap.get(t);
            idex++;
            if(idex == 3) break;
        }
        answer = 10000 * arr[0] + 100 * arr[1] + arr[2];
        return answer;
    }
}