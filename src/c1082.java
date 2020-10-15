import java.util.Scanner;

public class c1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		//String에서 16진수로 변경
		int b = Integer.valueOf(input, 16);
		
		//출력
		String s, ans;
		for (int i = 1; i < 16; i++) {
			s = Integer.toHexString(i).toUpperCase();
			ans = Integer.toHexString(b * i).toUpperCase();
			System.out.println(input + "*" + s + "=" + ans);
		}

	}//end of main()
}
