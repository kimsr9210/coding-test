import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0 ; i < a.length(); i++){
            String change = "";
            if(Character.isUpperCase(a.charAt(i))){
                change = String.valueOf(a.charAt(i)).toLowerCase();
            }else{
                change = String.valueOf(a.charAt(i)).toUpperCase();
            }
            answer += change;
        }
        System.out.println(answer);
    }
}