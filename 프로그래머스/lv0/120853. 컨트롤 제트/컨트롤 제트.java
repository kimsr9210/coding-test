class Solution {
    public int solution(String s) {
        int answer = 0;
        //String a = s.replaceAll(" ", ",");
        String arr[] = s.replaceAll(" ", ",").split(","); 
        //공백제거 후 쉼표로 치환 
        //쉼표를 기준으로 문자를 분리하여 배열에 저장
        for(int i = 0; i < arr.length; i++) {
        	//System.out.println(arr[i]);
        	if(!arr[i].equals("Z")) { //Z가 아니라면
            	answer += Integer.parseInt(arr[i]);
        	}else { //Z라면
        		answer-= Integer.parseInt(arr[i-1]);
        	}
        }
        return answer;
    }
}