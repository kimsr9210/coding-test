class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            for(int s = queries[i][0]; s <= queries[i][1]; s++){
                if(s % queries[i][2] == 0){
                    arr[s]++;
                }
            }
        }
        return arr;
    }
}