import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[][] str = new String[record.length][3]; //세로, 가로
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        //각 문자열을 띄어쓰기 단위로 분리하여 2차원 배열에 저장
        for (int i = 0; i < record.length; i++) {
            //result[i] = record[i].split("\\s+"); // "\\s+"는 띄어쓰기를 의미하는 정규표현식
            str[i] = record[i].split(" ");
        }
        
        for(int i = 0; i < str.length; i++) {
        	if(str[i].length == 3) {
        		hashMap.put(str[i][1], str[i][2]);
        	}else {
        		hashMap.put(str[i][1], hashMap.get(str[i][1]));
        	}
        }

        for(int i = 0; i < str.length; i++) {
        	String sts = str[i][0]; //상태
        	String key = str[i][1];
        	
        	String msg = "";
        	if(sts.equals("Enter")) {
        		msg = "님이 들어왔습니다.";
        	}else if(sts.equals("Leave")) {
        		msg = "님이 나갔습니다.";
        	}

        	if(!sts.equals("Change")) {
        		arrayList.add(hashMap.get(key)+msg);
        	}
        }
        
        String[] answer = new String [arrayList.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}