class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String [] str = dartResult.replaceAll("[*#]","").split("[SDT]"); //점수
        String[] bonus = dartResult.substring(1,dartResult.length()).split("[012345678910]"); //보너스

        int[] score = new int [str.length];
        for(int i = 0; i < score.length; i++) score[i] = Integer.parseInt(str[i]);
        for(int i = 0; i < score.length; i++) {
        	String option = ""; //옵션 (*,#)
        	if(bonus[i].length() == 2) {
        		option = bonus[i].substring(1,2);
        		bonus[i] = bonus[i].substring(0,1);
        	} 

        	if(bonus[i].equals("S")) score[i] = (int)Math.pow(score[i], 1);
        	if(bonus[i].equals("D")) score[i] = (int)Math.pow(score[i], 2);
        	if(bonus[i].equals("T")) score[i] = (int)Math.pow(score[i], 3);
            
        	if(option.equals("*")){
        		score[i] = score[i] * 2;
        		if(i != 0) score[i-1] = score[i-1] * 2;
        	}else if(option.equals("#")){
        		score[i] = score[i] - (score[i] * 2);
        	}
        }
        
        for(int i : score) answer += i;
        
        return answer;
    }
}