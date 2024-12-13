class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        char[][] c1 = new char[n][n];
        char[][] c2 = new char[n][n];

        for(int i = 0; i < arr1.length; i++){
            String str1 = Integer.toBinaryString(arr1[i]);
            if(str1.length() < n){
                int length = n - str1.length(); //길이가 몇개 모잘라는지 체크
                String zero = "0";
                zero = zero.repeat(length);
                str1 = zero + str1;
            }
            
            String str2 = Integer.toBinaryString(arr2[i]);
            if(str2.length() < n){
                int length = n - str2.length(); //길이가 몇개 모잘라는지 체크
                String zero = "0";
                zero = zero.repeat(length);
                str2 = zero + str2;
            }
            
            for(int j = 0; j < str1.length(); j++){
                c1[i][j] = str1.charAt(j);
                c2[i][j] = str2.charAt(j);
            }
        }
        
        for(int i = 0; i < n; i++){
            String str = "";
            for(int j = 0; j < n; j++){
                str += (c1[i][j] - '0' + c2[i][j] - '0' != 0) ? "#" : " ";
            }
            answer[i] = str; 
        }

        return answer;
    }
}