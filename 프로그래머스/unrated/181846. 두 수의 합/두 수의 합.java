import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        answer += x.add(y);
        return answer;
    }
}