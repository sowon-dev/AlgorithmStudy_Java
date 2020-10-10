import java.util.Scanner;

public class c1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] nums = input.split(" ");
        System.out.printf("%d", Integer.parseInt(nums[0])%Integer.parseInt(nums[1]));
    }
}
