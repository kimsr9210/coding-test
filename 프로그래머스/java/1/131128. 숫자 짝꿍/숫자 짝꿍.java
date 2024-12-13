class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] cntX = new int [10];
        int[] cntY = new int [10];
        
        for(String x : X.split("")){
            cntX[Integer.parseInt(x)]++; //배열에 index에 저장된 수 cnt 
        }
        
        for(String y : Y.split("")){
            cntY[Integer.parseInt(y)]++; 
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int i = 9; i >= 0; i--){
            while(cntY[i] > 0 && cntX[i] > 0){
                sb.append(i);
                cntY[i]--;
                cntX[i]--;
            }
        }
        
        if("".equals(sb.toString())) return "-1";
        if(sb.toString().substring(0,1).equals("0")) return "0";
        answer = sb.toString();
        return answer;
    }
}
