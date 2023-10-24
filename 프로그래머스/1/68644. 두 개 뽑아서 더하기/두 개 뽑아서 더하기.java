import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		if(!arrayList.contains(numbers[i] + numbers[j])) {
        			arrayList.add(numbers[i] + numbers[j]);
        		}
        	}
        }

        int[] answer = arrayList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}