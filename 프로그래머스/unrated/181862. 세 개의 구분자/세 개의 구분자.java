import java.util.ArrayList;
class Solution {
    public String[] solution(String myStr) { //a,b,c
        String str = "";
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < myStr.length(); i++){
            char ch = myStr.charAt(i);
            if(ch != 'a' && ch != 'b' && ch != 'c') str += ch;
            else
                if(str.length() > 0){
                    arrayList.add(str); 
                    str = ""; 
                }
        }

        if(str.length() > 0) arrayList.add(str);
        if(arrayList.size() == 0) arrayList.add("EMPTY");
        
        String[] answer = new String [arrayList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}