import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        //.copyOf() //원본배열, 복사할 길이
        //.copyOfRange() //원본배열, 복사할 시작인덱스, 복사할끝인덱스
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0) arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            else arr = Arrays.copyOfRange(arr, query[i], arr.length);
        }
        return arr;
    }
}