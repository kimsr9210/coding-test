class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String cut = "";
        if(A.equals(B)) {
        	answer = 0 ; 
        	return answer;
        }else {
            for(int i = 0 ; i < A.length(); i++) {
                cut = A.substring(A.length()-1,A.length());
                A = A.substring(0, A.length()-1);
                A = cut + A ;
                if(A.equals(B)) {
                	answer = i+1; 
                	return answer;
                }
            }
        }
        return answer;
    }
}
