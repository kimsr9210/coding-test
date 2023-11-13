class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        for(char letter : s.toCharArray()){
            char temp = letter;
            int idx = 0;
            while(idx < index){
                temp = temp == 'z' ? 'a' : (char)(temp+1);
                if(!skip.contains(String.valueOf(temp))) idx++;
            }
            sb.append(temp);
        }
        String answer = sb.toString();
        return answer;
    }
}