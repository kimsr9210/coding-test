class Solution {
    public int solution(String[] babbling) {
        //"aya", "ye", "woo", "ma"
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            String baby = babbling[i];
            if(baby.contains("ayaaya")|| baby.contains("yeye") || baby.contains("woowoo") || baby.contains("mama")){
                continue;
            }
            
            baby = baby.replaceAll("aya", " ");
            baby = baby.replaceAll("ye", " ");
            baby = baby.replaceAll("woo", " ");
            baby = baby.replaceAll("ma", " ");
            baby = baby.replaceAll(" ", "");
            if(baby.isEmpty()) answer++;
        }
        return answer;
    }
}