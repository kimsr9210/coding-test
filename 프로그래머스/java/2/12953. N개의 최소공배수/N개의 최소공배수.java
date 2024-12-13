class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int num = arr[arr.length-1]; //제일 마지막 index 배수
        int ok = arr.length - 1; //총 통과해야 하는 갯수
        while(ok != answer) {
        	answer = 0;
            num += arr[arr.length-1];
            for(int i = 0; i < arr.length-1; i++) {
            	if (num % arr[i] == 0) answer++;
            }
        }
        answer = num;
        return answer;
    }
}