import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arrayList.isEmpty()){
                arrayList.add(arr[i]);
            }else{
                int lastIndex =  arrayList.size()-1;
                if(arrayList.get(lastIndex) == arr[i]){
                    arrayList.remove(lastIndex);
                }else{
                    arrayList.add(arr[i]);
                }
            }
        }
        
        if(arrayList.size() == 0) arrayList.add(-1);
        
        int[] answer = new int [arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}