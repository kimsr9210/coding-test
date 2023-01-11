class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
    	int some = money / 5500; ;
    	money = money % 5500;
    	
    	answer[0] = some;
    	answer[1] = money;

        return answer;
    }
}