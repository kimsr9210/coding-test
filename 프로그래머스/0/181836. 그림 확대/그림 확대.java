import java.util.ArrayList;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String [picture.length * k];
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++){
            String str = "";
            for(int j = 0; j < picture[i].length(); j++){
                char c = picture[i].charAt(j);
                str += String.valueOf(c).repeat(k);
            }
            
            for(int r = 0; r < k; r++){
                arrayList.add(str);
            }
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
