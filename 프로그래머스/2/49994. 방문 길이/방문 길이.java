import java.util.*;
class Solution {
    public int solution(String dirs) {
        double r = 0, c = 0;
        HashSet<String> hashSet = new HashSet<>();
        for(int i = 0; i < dirs.length(); i++){
            char dir = dirs.charAt(i);
                		if(dir == 'U' && c + 1 <= 5) {
    			hashSet.add(r+" "+(c+0.5));
    			c++;
    		}
    		if(dir == 'D' && c - 1 >= -5) {
    			hashSet.add(r+" "+(c-0.5));
    			c--;
    		}
    		if(dir == 'R' && r + 1 <= 5) {
    			hashSet.add((r+0.5)+" "+c);
    			r++;
    		}
    		if(dir == 'L' && r - 1 >= -5) {
    			hashSet.add((r-0.5)+" " + c);
    			r--;
    		}
        }
        int answer = hashSet.size();
        return answer;
    }
}