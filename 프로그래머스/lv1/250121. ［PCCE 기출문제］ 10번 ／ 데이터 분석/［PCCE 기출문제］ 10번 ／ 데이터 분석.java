import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("code",0);
        hashMap.put("date",1);
        hashMap.put("maximum",2);
        hashMap.put("remain",3);
        
        //데이터 추출 
        int exts = hashMap.get(ext); 
        for(int i = 0; i < data.length; i++){
            if(data[i][exts] < val_ext){
                arrayList.add(data[i][0]);
            }
        }
        
        //삽입
        int index = 0;
        int[][] answer = new int [arrayList.size()][4];
        for(int i = 0; i < data.length; i++){
            if(arrayList.contains(data[i][0])){
                for(int j = 0; j < 4; j++){
                    answer[index][j] = data[i][j];
                }
                index++;
            }
        }
        
        //정렬
        int sort_bys = hashMap.get(sort_by);
        Arrays.sort(answer,(o1,o2) -> (o1[sort_bys]-o2[sort_bys])); 
        return answer;
    }
}