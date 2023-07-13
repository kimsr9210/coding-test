import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        //import java.math.BigInteger;
    	//BigInteger가 문자열로 되어 있기 때문에 초기화하기 위해서는 문자열을 인자 값으로 넘겨주어야 한다.
        String answer = "";
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        answer += x.add(y);
        return answer;
    }
}
