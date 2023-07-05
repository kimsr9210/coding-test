import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr); //정렬
        ArrayList<String> arrayList = new ArrayList<>();
        for(String a : arr){
            if(!a.equals("")) arrayList.add(a);
        }
       
        String[] answer = new String [arrayList.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}