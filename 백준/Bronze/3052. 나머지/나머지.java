import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            arr[i] = a%42;
        }
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.print(arr.length);
	}
}