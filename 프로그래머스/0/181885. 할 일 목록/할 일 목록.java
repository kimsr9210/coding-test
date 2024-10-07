import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished){
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false) arrayList.add(todo_list[i]); 
        }
        
        String[] answer = new String [arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}