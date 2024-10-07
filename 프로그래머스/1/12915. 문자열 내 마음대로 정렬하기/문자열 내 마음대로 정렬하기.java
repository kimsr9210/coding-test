import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arrayList = new ArrayList<>(); 
        for(int i = 0; i < strings.length; i++) {
        	arrayList.add(strings[i].charAt(n) + strings[i]);
        }
        
        String[] answer = new String[arrayList.size()];
        Collections.sort(arrayList);
        
        for(int i = 0; i < arrayList.size(); i++) {
        	answer[i] = arrayList.get(i).substring(1, arrayList.get(i).length());
        }
        return answer;
    }
}