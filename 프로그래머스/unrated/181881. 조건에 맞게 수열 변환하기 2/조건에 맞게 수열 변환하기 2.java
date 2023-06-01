class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] copy = arr.clone(); //배열 복사
        while(true){
            copy = arr.clone();
            cnt = 0;
            answer++;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                }else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = (arr[i] * 2) + 1;
                }
                if(copy[i] == arr[i]) {
                	cnt++;
                }
                if(cnt == arr.length) return answer-1;
            }
        }
    }
}