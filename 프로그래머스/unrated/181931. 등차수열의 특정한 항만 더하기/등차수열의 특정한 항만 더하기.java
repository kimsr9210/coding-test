class Solution {
    public int solution(int a, int d, boolean[] included) {
        //첫번째 항이 a
        //공차가 d 
        int answer = 0;
        int num = a;
        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer += num;
            } 
            
            num += d;
        }
        return answer;
    }
}