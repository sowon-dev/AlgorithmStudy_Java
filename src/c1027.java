import java.util.Scanner;

public class c1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.next();
        sc.close();

        String[] dateSplit = date.split("\\.");
        System.out.printf("%s-%s-%s", dateSplit[2], dateSplit[1], dateSplit[0]);
    }
}
