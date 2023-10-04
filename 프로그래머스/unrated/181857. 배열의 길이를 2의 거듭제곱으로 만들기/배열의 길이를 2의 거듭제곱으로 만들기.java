class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int i = 1; i <= 1024; i *= 2){
            if(i >= arr.length) {
                length = i;
                break;
            }
        }
        
        int[] answer = new int [length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer; 
    }
}