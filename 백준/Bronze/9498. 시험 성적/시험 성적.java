import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
        String answer = "";
        if(num > 89){
            answer = "A";
        }else if(num > 79){
            answer = "B";
        }else if(num > 69){
            answer = "C";
        }else if(num > 59){
            answer = "D";
        }else{
            answer = "F";
        }
		System.out.println(answer);
	}
}