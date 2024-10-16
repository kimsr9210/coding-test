import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hour, min;
        hour = sc.nextInt();
        min = sc.nextInt();
        
        if((min - 45) < 0) {
            if(hour == 0) hour = 24;
            hour--;
            min = 60 - Math.abs((min - 45));
        }else{
            min = min - 45 ;
        }

        System.out.println(hour + " " + min);
    }
}