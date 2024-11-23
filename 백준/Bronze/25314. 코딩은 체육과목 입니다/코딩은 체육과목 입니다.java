import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 4;
        String str = "";
        for(int i = 0; i < a; i++){
            str += "long ";
        }
        str += "int";
        System.out.print(str);
}
}