class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] scores = new int [3] ; //점수 배열 저장
        String score = ""; //점수
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            switch(c) {
                case 'S' : 
                    scores[index++] = (int)Math.pow(Integer.parseInt(score), 1);
                    score = "";
                    break;
                case 'D' : 
                    scores[index++] = (int)Math.pow(Integer.parseInt(score), 2);
                    score = "";
                    break;
                case 'T' : 
                    scores[index++] = (int)Math.pow(Integer.parseInt(score), 3);
                    score = "";
                    break;
                case '*' : 
                    scores[index-1] = scores[index-1] * 2;
                    if(index > 1) scores[index-2] = scores[index-2] * 2;
                    break;
                case '#' : 
                    scores[index-1] = scores[index-1] - (scores[index-1] * 2);
                    break;
                default : 
                    score += String.valueOf(c);
            }
        }

        for(int s : scores) answer += s;

        return answer;
    }
}
