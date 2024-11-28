import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t2 = 1;
        for(int i = 0; i < t; i++){
           for(int j = 0; j < t2; j++){
               System.out.print("*");
           }
           System.out.println("");
            t2++;
        }
}
}