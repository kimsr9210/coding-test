public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        for(int i = 0; i < targets.length; i++) {
            String[] target = targets[i].split("");
            int total = 0;
            for(String t : target) {
                int min = Integer.MAX_VALUE;

                for(String key : keymap) {
                    int index = key.indexOf(t);
                    if(index != -1){
                        min = Math.min(index + 1, min);
                    }
                }
                if(min == Integer.MAX_VALUE) {
                    total = -1;
                    break;
                }
                total += min;
            }
            answer[i] = total;
        }
        return answer;
    }
}