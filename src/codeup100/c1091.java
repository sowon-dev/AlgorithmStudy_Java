import java.util.Scanner;

public class c1091 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		sc.close();
		
		long a = Integer.parseInt(nums[0]); //시작값
		int m = Integer.parseInt(nums[1]); //곱할값
		int d = Integer.parseInt(nums[2]); //더할값
		int n = Integer.parseInt(nums[3]); //몇번째인지 나타내는 숫자		
		
		//int에 넘치므로 long으로
		//-50 50 -50 10 => -99649234693877550
		
		for(int i=0; i<n-1; i++) {
			a = (a*m+d);
		}
		System.out.println(a);
		
		
		/* 연습
		System.out.println(1*-2+1); //-1
		System.out.println(-1*-2+1); //3
		System.out.println(3*-2+1); //-5
		System.out.println(-5*-2+1); //11
		*/
	}
}
