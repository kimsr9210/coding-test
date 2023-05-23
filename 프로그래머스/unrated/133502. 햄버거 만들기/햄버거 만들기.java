class Solution {
    public int solution(int[] ingredient) {
        //빵 – 야채 – 고기 - 빵
        //1 - 2 -  3 - 1
        int answer = 0;
        int idex = 0;
        int stack[] = new int [ingredient.length];
        for(int i : ingredient){
            stack[idex++] = i; 
            if(idex >= 4 && stack[idex-1] == 1 
              && stack[idex-2] == 3 
              && stack[idex-3] == 2
              && stack[idex-4] == 1){
                idex -= 4;
                answer++;
            }
        }
        return answer;
    }
}