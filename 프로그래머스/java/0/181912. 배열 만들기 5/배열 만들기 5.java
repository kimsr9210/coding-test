import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            String num = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(num) > k) arrayList.add(Integer.parseInt(num)); 
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}