import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        //진법을 사용하여 특정 숫자로 변환할 때 5는 자연스럽게 변환할 수 있지만, 다른 숫자들은 별도로 치환 작업이 필요
        //String binaryString = Integer.toBinaryString(i).replace('1', '2');
        //int num = Integer.parseInt(binaryString);
        ArrayList<Integer> arrayList = new ArrayList();

        for(int i = 1; i < 64; i++){
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if(num >= l && num <= r) arrayList.add(num);
        }
        return arrayList.isEmpty() ? new int[] { -1 } : arrayList.stream().mapToInt(i -> i).toArray();
    }
}