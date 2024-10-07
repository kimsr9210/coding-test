class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    	String[] answer = new String[n];
        String a1 = "";
        String a2 = "";
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        
        for(int i = 0 ; i < arr1.length; i++) {
        	a1 = Integer.toString(arr1[i], 2); //이진수로 변환
        	a2 = Integer.toString(arr2[i], 2);
            for(int j = 0; j < arr1.length; j++) {
            	//길이가 같은지 확인 같지 않다면 0추가
                if(a1.length() != n) {
                	String add = "";
                	for(int l = 0; l < n-a1.length(); l++ ) {
                		add += 0;
                	}
                	a1 = add + a1;
                }
                if(a2.length() != n) {
                	String add = "";
                	for(int l = 0; l < n-a2.length(); l++ ) {
                		add += 0;
                	}
                	a2 = add + a2;
                }
            }
            str1[i] = a1;
            str2[i] = a2;
        }
        
        for(int i = 0; i < n; i++) {
            String sum = "";
        	for(int j = 0; j < n; j++) {
        		sum += (str1[i].charAt(j) + str2[i].charAt(j) > 96) ? "#" : " "; //(10진수 + 10진수) > 96 
        	}
        	answer[i] = sum; 
        }
        return answer;
    }
}