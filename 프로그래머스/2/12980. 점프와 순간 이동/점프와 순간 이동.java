import java.util.*;

public class Solution {
    public int solution(int n) {
    	//도착지점에서 거꾸로 되감기 해본다고 생각
    	//2배를 순간이동할 수 있기에 도착하는 지점에서 2로 나누어 되돌아 가는 과정에서는 건전지 사용량이 늘어나지 않음
        int ans = 0;
        while(n > 0) {
        	if(n % 2 == 0) {
        		n /= 2;
        	}else {
        		n--;
        		ans++;
        	}
        }
        return ans;
    }
}