import java.util.Scanner;

public class c1058 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		sc.close();
        
        int bo1 = Integer.parseInt(s[0]);
        int bo2 = Integer.parseInt(s[1]);
        
        if(bo1 == 0 && bo2 ==0) System.out.println(1);
        else System.out.println(0);
        
	}
}
