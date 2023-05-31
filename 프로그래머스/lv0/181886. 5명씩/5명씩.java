import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        int idex = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < names.length; i++){
            if(idex == i){
               arrayList.add(names[i]);
               idex = idex+=5;
            }
        }
        String[] answer = new String[arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}