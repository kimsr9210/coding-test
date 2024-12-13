import java.util.ArrayList;


class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		arrayList.add(i);
        		System.out.println(arrayList);
        	}
        }
        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}