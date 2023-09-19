import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();
        
        for(int i = 0; i < cards1.length; i++) card1.add(cards1[i]);
        for(int i = 0; i < cards2.length; i++) card2.add(cards2[i]);
        
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