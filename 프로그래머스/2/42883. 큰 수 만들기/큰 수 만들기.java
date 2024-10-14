class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int index = 0;
        StringBuffer sb = new StringBuffer();

        // 앞에서 부터 (전체길이 - k) 수 중 가장 큰 수 선택
        // 선택한 수 다음 인덱스 부터 탐색 범위를 한칸씩 늘려가며 반복 탐색
        for(int i = 0; i < number.length() - k; i++){ 
            char max = 0;
            for(int j = index; j <= k+i; j++){ 
                if(max < number.charAt(j)){
                    max = number.charAt(j);
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        answer = sb.toString();
        return answer;
    }
}