import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> card1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2 = new LinkedList<>(Arrays.asList(cards2));

        for(int i = 0; i < goal.length; i++){
            String c1 = card1.peek();
            String c2 = card2.peek();
            if(goal[i].equals(c1)){
                card1.remove();
            }else if(goal[i].equals(c2)){
                card2.remove();
            }else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}
