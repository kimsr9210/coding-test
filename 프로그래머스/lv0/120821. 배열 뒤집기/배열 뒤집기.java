class Solution {
    public int[] solution(int[] num_list) {
    	int[] answer =  new int [num_list.length]; //5
    	int idx = 0;

    	for(int i = num_list.length-1; i >= 0 ; i--) {
    		answer[idx] = num_list[i];
    		System.out.println(answer[idx]);
    		idx++;
    	}
        return answer;
    }
}