class Solution {
    public int[] solution(long n) {
    	//String클래스에서는 reverse() 메소드를 제공하지 않아 StringBuffer로 변환해서 사용해야한다. 
    	//reverse() 문자열 뒤집는 메서드
        //reverse()메소드를 사용하면 StringBuffer객체로 return하기 때문에 toString을 사용하여 String으로 변환

        String typeChange = String.valueOf(n); //long -> String으로 형변환
        StringBuffer sb = new StringBuffer(typeChange);
        typeChange = sb.reverse().toString(); //거꾸로 
        
        int[] answer = new int[typeChange.length()];
        String[] str = new String[typeChange.length()];
        str = typeChange.split("");
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}
