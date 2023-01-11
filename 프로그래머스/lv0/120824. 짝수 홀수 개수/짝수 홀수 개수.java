class Solution {
    public int[] solution(int[] num_list) {
    	int[] answer = new int[2];
    	int odd  = 0 ; 
    	int even = 0 ; 
    	for(int a : num_list) {
    		if(a % 2 == 0) {
    			odd ++;
    		}else {
    			even ++;
    		}
    	}
    	answer[0] = odd;
    	answer[1] = even;
    	return answer;
    }
}