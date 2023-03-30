import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        //약관종류
        for(int i = 0 ; i < terms.length; i++) {
        	map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]);      	
        }

        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        for(int i = 0; i < privacies.length; i++) {
        	String date = privacies[i].split(" ")[0]; //공백 분리 0 번째 ex) 2021.10.12 A -> 2021.10.12
        	//System.out.println("day : "+ date);
        	int type = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28 ; //한달에 28일 까지 있으므로 28을 곱해야함

            int num = (year - Integer.parseInt(date.split("\\.")[0]))*28*12
                    + (month - Integer.parseInt(date.split("\\.")[1]))*28
                    + (day - Integer.parseInt(date.split("\\.")[2]));
        	 if(num >= type) {
        		 list.add(i+1);
        	 }
        }
        //Java 8 이상일 경우 stream API를 사용
        //Integer list를 배열(array)로 변환
        answer = list.stream().mapToInt(i -> i).toArray(); 
        //list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
        return answer;
    }
}