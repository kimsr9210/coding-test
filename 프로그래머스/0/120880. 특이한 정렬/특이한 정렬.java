import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int [numlist.length];
        HashMap<Double, Integer> hashMap = new HashMap<>(); 
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] - n < 0){
                hashMap.put(Math.abs(numlist[i]-n) + 0.5, i);
            }else{
                hashMap.put((double)(numlist[i]-n),i);
            }
        }
        
        ArrayList<Double> arrayList = new ArrayList<>(hashMap.keySet());
        Collections.sort(arrayList);
        
        int index = 0;
        for(Double a : arrayList){
            answer[index++] = numlist[hashMap.get(a)];
        }
        
        return answer;
    }
}