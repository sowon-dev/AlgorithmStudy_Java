import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String[] sArr = s.split(" ");
		
		//String -> long 출력
		System.out.printf("%d", Long.parseLong(sArr[0])+Long.parseLong(sArr[1]));
	}
}
