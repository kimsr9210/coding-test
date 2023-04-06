import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) { 
		    //nextLine() : 문자 또는 엔터를 치기 전까지의 문장 전체를 입력받는다.
			String str = scan.nextLine(); 
			System.out.println(str);
		}
        }
}
