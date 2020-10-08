import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		
		//부호바꿔서 출력
		System.out.printf("%s", -s);
	}
}
