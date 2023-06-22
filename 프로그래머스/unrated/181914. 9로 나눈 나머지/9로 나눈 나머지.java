class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        for(String a : arr){
            answer += Integer.parseInt(a);
        }
        answer = answer % 9 ;
        return answer;
    }
}