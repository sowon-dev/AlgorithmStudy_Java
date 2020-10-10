import java.util.Scanner;

public class c1034 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int octal = Integer.parseInt(s, 8);
		
		System.out.printf("%d", octal);		
	}

}
