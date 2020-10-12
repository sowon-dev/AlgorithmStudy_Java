import java.util.Scanner;

public class c1066_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i=0; i<3; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]%2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        sc.close();
    }
}
