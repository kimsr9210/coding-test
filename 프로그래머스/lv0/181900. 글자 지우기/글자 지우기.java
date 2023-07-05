import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        Arrays.sort(indices); //배열 정렬

        for(int i : indices) arrayList.add(i);

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(!arrayList.contains(i)) answer += c;
        }
        return answer;
        
    }
}