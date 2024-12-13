class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int [num_list.length];
        int idex = 0;
        for(int i = 0 ; i < num_list.length; i++){
            if(n >= num_list.length){
                answer[i] = num_list[idex];
                idex++;
            }else{
              answer[i] =  num_list[n]; 
            }
            n++;
        }
        return answer;
    }
}