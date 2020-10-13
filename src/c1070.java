import java.util.Scanner;

public class c1070 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();
        
        switch (month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("winter");
			break;
		case 3: 
		case 4: 
		case 5: 
			System.out.println("spring");
			break;
		case 6: 
		case 7: 
		case 8: 
			System.out.println("summer");
			break;
		case 9: 
		case 10: 
		case 11: 
			System.out.println("fall");
			break;
		default:
			System.out.println("");
		}   
	}
}
