import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0}; //가장 먼저 탈락하는 사람 번호, 몇번째 차례에 탈락하는지

        HashSet<String> set = new HashSet<>();
        
        set.add(words[0]);
        String lastWord = words[0].substring(words[0].length()-1,words[0].length());
        
        for(int i = 1; i < words.length; i++){
            
            String eq = words[i].substring(0,1);
            
            if(!set.contains(words[i]) && lastWord.equals(eq) && words[i].length() >= 2){
                set.add(words[i]);
                lastWord = words[i].substring(words[i].length()-1,words[i].length());
            }else{
                answer[0] = (i % n) + 1;//사람 번호
                answer[1] = (i / n) + 1;
                return answer;
            }
        }
        return answer;
    }
}