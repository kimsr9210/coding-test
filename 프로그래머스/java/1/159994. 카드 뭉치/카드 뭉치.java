import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //*흰트 "순서대로 한 장씩 사용"  
        String answer = "Yes";
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));        
        for(String letter : goal){
           String card1 = queue1.peek();
           String card2 = queue2.peek();
           if(letter.equals(card1)){
               queue1.remove(); //선입선출
           } else if(letter.equals(card2)){
               queue2.remove();
           } else {
               answer = "No";
           }
        }
        return answer;
    }
}