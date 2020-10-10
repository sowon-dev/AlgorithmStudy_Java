import java.util.Scanner;

public class c1035 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		//String을 16진수로 변경
		int tmp = Integer.parseInt(s, 16);
		
		//16진수를 8진수로 출력
		System.out.printf("%o", tmp);		
	}

}
