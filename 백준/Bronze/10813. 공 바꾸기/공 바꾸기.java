import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = i+1;
        }
        for(int i = 0; i < b; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int tmp = 0;
            tmp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = tmp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
	}
}