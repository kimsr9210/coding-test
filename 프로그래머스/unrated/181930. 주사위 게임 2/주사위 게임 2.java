class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c;
        if(a != b && a != c && b != c){ //모두 다르다면
            return answer;
        }else if(a == b && a == c && b == c){ //모두 같다면
            answer = answer * ((a * a ) + (b * b) + (c * c)) * ((a * a  * a) + (b * b * b) + (c * c * c)) ;
        }else{ //두 숫자는 같고 한 숫자만 다르다면?
            answer = answer * ((a * a ) + (b * b) + (c * c));
        }
        return answer;
    }
}