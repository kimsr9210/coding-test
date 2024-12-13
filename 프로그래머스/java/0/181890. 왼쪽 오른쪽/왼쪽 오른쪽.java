import java.util.ArrayList;
class Solution {
    public String[] solution(String[] str_list) {
        //l 해당 문자열을 기준으로 왼쪽
        //r 해당 문자열을 기준으로 오른쪽
        //l,r 없다면 빈 리스트
        ArrayList<String> arrayList = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int l = 0; l < i; l++){
                    arrayList.add(str_list[l]);
                }
                break;    
            }else if(str_list[i].equals("r")){
                for(int r = i+1; r < str_list.length; r++){
                    arrayList.add(str_list[r]);
                }
                break; 
            }
        }
        String[] answer = new String [arrayList.size()];
        if(answer.length > 0){
            for(int i = 0; i < answer.length; i++){
                answer[i] = arrayList.get(i);
            }
        }
        return answer;
    }
}