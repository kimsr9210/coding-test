import java.util.ArrayList;
class Solution {
    public int[] solution(String msg) {
        ArrayList<String> dic = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        //1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
        char c = 65;
        for(int i = 1; i <= 26; i++){
            String str = String.valueOf(c);
            dic.add(str);
            c++;
        }

        //2.w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거한다.
        //3.입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
        //4.단계 2로 돌아간다.
        for(int i = 0; i < msg.length(); i++){
            for(int j = dic.size()-1; j >= 0; j--){
                if(msg.substring(i).startsWith(dic.get(j))){
                    i += dic.get(j).length()-1;
                    result.add(j+1);
                    if(i+1 < msg.length()) dic.add(dic.get(j)+msg.charAt(i+1));
                    
                    break;
                }
            }
        }
        
        int[] answer = new int [result.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}