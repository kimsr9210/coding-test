class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        int sharIndex = 1;
        for(int i = share+1; i <= balls; i++) {
        	answer *= i;
        	answer /= sharIndex;
        	sharIndex++;
        }
        return (int)answer;
    }
}