import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] strArr) {

        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")) arrayList.add(strArr[i]);
        }
        
        String[] answer = new String [arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
    
        return answer;
    }
}