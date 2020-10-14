import java.util.Scanner;

public class c1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] value = new int[len];
		
		for(int i = 0; i <value.length; i++) {
			value[i] =sc.nextInt();
			System.out.println(value[i]);
		}
	}
}
