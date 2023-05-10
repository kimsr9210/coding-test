class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int arr : num_list){
            if(arr == n){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}