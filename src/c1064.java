import java.util.Scanner;

public class c1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        sc.close();

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);

        System.out.printf("%d", a>b? b>c? c:b : a>c? c:a);
    }
}
