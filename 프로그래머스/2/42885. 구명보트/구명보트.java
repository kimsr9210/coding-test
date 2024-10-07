import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length-1;
        while(left <= right) {
        	if(people[left] + people[right] <= limit) { // 가장 작은사람 + 가장 큰사람 합한 결과가 제한 사항보다 작으면 두사람을 보트에 태운다
        		left++; 
        	}
        	right--;
        	answer++;
        }
        return answer;
    }
}