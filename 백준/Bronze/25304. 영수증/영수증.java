import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int x = sc.nextInt();
        int price = 0;
        for(int i = 0; i < x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            price += a*b;
        }
        if(total == price){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
}
}