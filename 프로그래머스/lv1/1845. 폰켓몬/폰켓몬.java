import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>(); //순서유지 x 중복 불가
        for(int i = 0; i < nums.length; i++) {
            if(!hashSet.contains(nums[i])) hashSet.add(nums[i]);
        }
        int answer = hashSet.size() > nums.length/2 ? nums.length/2 : hashSet.size();
        return answer;
    }
}