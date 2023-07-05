class Solution {
    public int solution(String[] order) {
        //아메리카노 || 아무거나 4500
        //레떼 5000
        int answer = 0;
        for(String o : order){
            if(o.contains("latte")) answer += 5000;
            else answer += 4500;
        }
        return answer;
    }
}
