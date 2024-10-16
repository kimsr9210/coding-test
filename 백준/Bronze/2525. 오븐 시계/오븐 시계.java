import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hour, min, time;
        hour = sc.nextInt();
        min = sc.nextInt();
        time = sc.nextInt();
        
        if((min + time) >= 60){
            hour = hour + ((min + time) / 60);
            if(hour >= 24) hour = hour - 24;
            min = (min + time) % 60;
        }else{
            min = min + time;
        }
        System.out.println(hour + " " + min);
    }
}