import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> arr1 = new ArrayList<>(Arrays.asList(s1));
        List<String> arr2 = new ArrayList<>(Arrays.asList(s2));
        arr1.retainAll(arr2);
        int answer = arr1.size();
        return answer;
    }
}