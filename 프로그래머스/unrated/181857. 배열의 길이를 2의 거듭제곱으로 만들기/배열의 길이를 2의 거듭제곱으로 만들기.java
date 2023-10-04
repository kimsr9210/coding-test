import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int i = 1; i <= 1024; i *= 2){ //*거듭제곱은 1도 고려해야함
            if(i >= arr.length) {
                length = i;
                break;
            }
        }
        //Arrays.copyOf() : 배열복사 
        //(원본 배열, 원본 배열에서 복사하고 싶은 요소들의 길이)
        int[] answer = Arrays.copyOf(arr,length);
        return answer; 
    }
}