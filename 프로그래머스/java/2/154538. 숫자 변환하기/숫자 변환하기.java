import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //hashMap.put(1, 0); //x에 n을 더한다
        hashMap.put(2, 0); //x에 2를 곱한다.
        hashMap.put(3, 0); //x에 3을 곱한다.

        if(x + n == y) {
            hashMap.put(1, 1);
        }

        int num2 = x;
        int cnt2 = 0;
        while(num2 < y){
            num2 = num2 * 2;
            hashMap.put(2,hashMap.get(2)+1);
        }
        System.out.println(cnt2);

        int num3 = x;
        int cnt3 = 0;
        while(num3 < y){
            num3 = num3 * 3;
            hashMap.put(3,hashMap.get(3)+1);
        }
        System.out.println(hashMap);

        if(num2 != y) hashMap.remove(2);
        if(num3 != y) hashMap.remove(3);

        if(hashMap.size() > 0){
            int min = Integer.MAX_VALUE;
            for(Integer key : hashMap.keySet()){
                min = Math.min(hashMap.get(key),min);
            }
            answer = min;
        }

        System.out.println(hashMap);
        System.out.println(answer);
        return answer;
    }
}