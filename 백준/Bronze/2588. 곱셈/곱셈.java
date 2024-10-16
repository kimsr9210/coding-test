import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        String str = String.valueOf(b);
        String[] arr = str.split("");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(a * Integer.parseInt(arr[i]));
        }
        System.out.println(a*b);
    }
}