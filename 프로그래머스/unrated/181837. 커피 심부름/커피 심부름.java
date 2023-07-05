class Solution {
    public int solution(String[] order) {
        //아메리카노 || 아무거나 4500
        //레떼 5000
        int answer = 0;
        for(String o : order){
            answer += o.contains("latte") ? 5000 : 4500;
        }
        return answer;
    }
}