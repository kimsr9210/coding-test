import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'x'){
               arrayList.add(index); 
               index = 0;
            }else{
                index++;
            }
            
            if(i == myString.length()-1) arrayList.add(index);
        }
        
        int[] answer = new int[arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}