class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length -1; //마지막 index
        int before = num_list.length -2; //마지막에서 두번째 index
        int add = num_list.length; //추가할 index
        int[] answer = new int [num_list.length + 1];
        
        answer[add] = num_list[before] < num_list[last] ? num_list[last] - num_list[before] :  num_list[last] + num_list[last];
        
        for(int i = 0 ; i < answer.length-1; i++) {
        	answer[i] = num_list[i];
        }  
        return answer;
    }
}