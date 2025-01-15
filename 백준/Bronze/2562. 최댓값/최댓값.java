import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int max = 0;
        int line = 0;
        for(int i = 1; i < 10; i++){
            int a = sc.nextInt();
            if(a > max){
                max = a;
                line = i;
            }    
        }
        System.out.println(max);
        System.out.println(line);
        
	}
}