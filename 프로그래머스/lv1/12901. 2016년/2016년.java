import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
class Solution {
    public String solution(int a, int b) {
        Calendar calendar = Calendar.getInstance(); //날짜 시간 가져오기
        //SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd (E)", Locale.ENGLISH);  //날짜 포맷 변환
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, a-1);
        calendar.set(Calendar.DATE, b);
        String  answer = dateFormat.format(calendar.getTime()); //날짜 가져옴 => ex) 2022-05-24 (Tue)
        System.out.println(answer);
        answer = answer.substring(12, 15).toUpperCase();
        return answer;
    }
}
