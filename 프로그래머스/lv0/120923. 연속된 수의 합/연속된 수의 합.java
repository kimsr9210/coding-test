class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        
        int number = 0;
        int start = 1;
        
        while(true) {
        	for(int i = 0; i < num; i++) {
        		number += start + i; // 1 2 3 //2 3 4 //3 4 5
        	}
        	if(number == total) {
        		break;
        	}
        	
        	if(number > total) { 
        		number = 0;
        		start --;
        	}else {
        		number = 0;
        		start++;
        	}
        };
        
        for(int j = 0 ; j < answer.length; j++) {
        	answer[j] = start + j ;
        }
        return answer;
    }
}