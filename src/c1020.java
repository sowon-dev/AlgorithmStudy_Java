import java.util.Scanner;

public class c1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jumin = sc.next();
        sc.close();

        // replace사용
        //System.out.println(jumin.replace("-", ""));
        
        // split사용
        String[] arr = jumin.split("-");
        System.out.println(arr[0]+arr[1]);
    }
}
