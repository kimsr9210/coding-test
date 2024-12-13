class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int limits = 0;
            //약수 구하는 로직
            for(int j = 1; j * j <= i; j++){
                if(j * j == i) limits++;
                else if (i % j == 0) limits += 2;
            }
            //제한수치를 초과하면 
            answer += limit < limits ? power : limits;
        }
        return answer;
    }
}