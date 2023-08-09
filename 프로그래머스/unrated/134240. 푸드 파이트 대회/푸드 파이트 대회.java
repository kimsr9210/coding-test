class Solution {
    public String solution(int[] food) {
        String left = "";
        for(int i = 1; i < food.length; i++){
            int foods = food[i] / 2;
            for(int j = 0; j < foods; j++){
                left += i;
            }
        }
        
        String right = "";
        for(int i = left.length()-1; i >= 0; i--){
            right += left.charAt(i);
        }

        String answer = left + "0" + right;
        return answer;
    }
}