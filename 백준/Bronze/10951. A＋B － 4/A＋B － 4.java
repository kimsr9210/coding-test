import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) { //hasNextInt() : 정수를 입력받은 경우 true , 받지 않은경우 false 
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
	    }
    }
}