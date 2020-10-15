import java.util.Scanner;

public class c1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stop = sc.nextInt();
		sc.close();
		
		int count = 1;
		while(count <= stop){ //누군가가 틀릴때까지
			if(count%3 == 0){
				System.out.printf("X ");
			} else { 
				System.out.print(count+" "); 
			}
			count ++;
		}

	}//end of main()
}
