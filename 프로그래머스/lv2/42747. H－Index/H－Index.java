import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); //배열 정렬
        for(int i = 0; i < citations.length; i++){
            int hIndex = citations.length - i;
            if(citations[i] >= hIndex){
                answer = hIndex;
                break;
            }
        }
        return answer;
    }
}