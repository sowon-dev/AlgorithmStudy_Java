import java.util.Scanner;

public class c1021 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String c = sc.next();
    
     //char로 받을 수 없으므로 문자열로 받은 뒤 char 배열에 넣.
		char[] arr = c.toCharArray();
		System.out.println(arr);
	}

}
