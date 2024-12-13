
class Solution {
    public int[] solution(int[] numbers, String direction) {
       int[] answer = new int[numbers.length];
        int num =  numbers.length-1; 
        if(direction.equals("right")) {
        	answer[0] = numbers[num];
        	for(int i = 1; i < answer.length; i++) {
        		answer[i] = numbers[i-1];
        	}
        }
        if(direction.equals("left")) {
        	answer[num] = numbers[0];
        	for(int i = 0; i < answer.length-1; i++) {
        		answer[i] = numbers[i+1];
        	}
        }
        return answer;
    
    }
}