import java.util.HashMap;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
       HashMap<String, String> hashMap = new HashMap<>(); //순서를 유지하지 않음 key중복 불가 value 중복 가능 
       
       for(String[] str : db) { //이게 어떻게 된거지?
    	   hashMap.put(str[0],str[1]);
       }

       if(hashMap.containsKey(id_pw[0])){ //Map에 key가 있으면 true
    	   answer = (hashMap.get(id_pw[0]).equals(id_pw[1])) ? "login" : "wrong pw";
       }else {
    	   answer = "fail";
       }
        return answer;
    }
}