import java.util.*;
class Solution {
    String[] words = {"A","E","I","O","U"};
    static List<String> list;
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        dfs("",0);
        for(int i = 0; i < list.size(); i++){
            if(word.equals(list.get(i))){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    public void dfs(String str, int index){
        list.add(str);
        if(index == words.length) return;
        for(int i = 0; i < words.length; i++){
            dfs(str+words[i], index+1);
        }
    }
}