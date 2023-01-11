class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int arr1 = dot[0];
        int arr2 = dot[1];
        
        if(arr1 > 0 && arr2 > 0) {
        	answer = 1;
        }else if(arr1 < 0 && arr2 > 0) {
        	answer = 2;
        }else if(arr1 < 0 && arr2 < 0) {
        	answer = 3;
        }else {
        	answer = 4;
        }
        return answer;
    }
}