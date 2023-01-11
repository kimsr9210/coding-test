package lv0;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

class Lv0_018 {
    public static void  main(String[] args) {
      int n = 17;
      String[] s1 = {"a", "b", "c"};
      String[] s2 = {"com", "b", "d", "p", "c"};
      System.out.println(solution(s1, s2));
    }
    //배열의 유사도
    public static int solution(String[] s1, String[] s2) {

      List<String> arr1 = new ArrayList<>(Arrays.asList(s1));
      List<String> arr2 = new ArrayList<>(Arrays.asList(s2));
      arr1.retainAll(arr2); //공통 요소들만 남기고 나머지는 제거 
      System.out.println(arr1);
      int answer = arr1.size();
      return answer;
    }
}