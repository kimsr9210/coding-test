import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt(); //총 금액
        int count = sc.nextInt(); //물품 구매 갯수
        int answer = 0;
        for(int i = 0; i < count; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            answer += price * num;
        }
        if(answer == amount){
           System.out.println("Yes"); 
        } else{
            System.out.println("No"); 
        }
    }
}