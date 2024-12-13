class Solution {
    public String solution(String s) {
        String[] str = s.split(" "); //공백 제거하고 배열에 저장

        int min = 0;
        int max = 0;
        for(int i = 0; i < str.length; i++){
            int put = Integer.parseInt(str[i]);
            if(i == 0){
                min = put;
                max = put;
            }

            min = Math.min(min, put);
            max = Math.max(max, put);
        }

        String answer = min + " " + max;
        return answer;
    }
}