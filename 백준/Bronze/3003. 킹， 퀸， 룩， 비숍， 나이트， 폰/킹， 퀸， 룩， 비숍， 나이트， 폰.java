import java.util.*;
public class Main{
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
	int[] arr = new int[6];
	int[] chess = {1, 1, 2, 2, 2, 8};
	for(int i = 0; i < arr.length; i++) {
	    arr[i] = chess[i] - sc.nextInt();
            System.out.println(arr[i]);
	}
    }
}
