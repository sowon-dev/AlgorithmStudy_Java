import java.util.Scanner;

public class c1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.next();

		//점(.)을 사용하기 위해선 \\.을 입력해야함. 
		//정리링크 : https://sowon-dev.github.io/2020/10/06/201006java/
		String[] ff = f.split("\\.");

		String int1 = ff[0];  
		String int2 = ff[1];  

		System.out.println(int1);
		System.out.println(int2);		
	}

}
