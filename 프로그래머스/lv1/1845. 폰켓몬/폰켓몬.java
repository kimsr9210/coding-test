import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        //1. 기존 length를 구한다.
        //2. 중복값을 제거한 length를 구한다.
        //3. 두 값중 최소값이 정답.
        HashSet<Integer> hashSet = new HashSet<>(); //순서유지 x 중복 불가
        for(int i = 0; i < nums.length; i++) {
            if(!hashSet.contains(nums[i])) hashSet.add(nums[i]);
        }
        int answer = hashSet.size() > nums.length/2 ? nums.length/2 : hashSet.size();
        return answer;
    }
}