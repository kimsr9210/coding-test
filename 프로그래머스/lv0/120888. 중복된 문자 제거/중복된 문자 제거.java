import java.util.*;
import java.util.Set;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String arr[] = my_string.split("");
        LinkedHashSet <String> set = new LinkedHashSet<String>(Arrays.asList(arr));
        answer = String.join("",set);
        return answer;
    }
}