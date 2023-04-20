import java.util.TreeSet;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        TreeSet<Integer> lTreeSet = new TreeSet<>(); //왼쪽
        TreeSet<Integer> rTreeSet = new TreeSet<>(); //오른쪽
        for(int i = 0; i < sizes.length; i++){
            lTreeSet.add(Math.max(sizes[i][0], sizes[i][1]));
            rTreeSet.add(Math.min(sizes[i][0], sizes[i][1]));
        }
        answer = lTreeSet.last() * rTreeSet.last();
        return answer;
    }
}