package backjoon;
import java.util.Scanner;
//멘토님이 풀이해주신 코드. 메서드를 나눠서 각각의 역할을 할 수 있게끔 구현했다.
public class mentob11005_2 {
    public static void main(String[] args) {
        new mentob11005_2().solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int base10 = Integer.parseInt(input[0], 10);
        int base = Integer.parseInt(input[1], 10);

        String result = changeBaseN(base10, base);
        System.out.println(result);
    }

    private String changeBaseN(int base10, int base) {
        String[] nBase = makeNBase(base);

        String result = "";
        while (base10 >= base) {
            int num = base10 % base;
            base10 = base10 / base;
            result = nBase[num] + result;
        }

        result = nBase[base10] + result;
        return result;
    }

    private String[] makeNBase(int base) {
        String[] nBase = new String[base];

        for (int i = 0; i < base; i++) {
            if (i < 10) {
                nBase[i] = i + "";
            } else {
                nBase[i] = (char)('A' + (i - 10)) + "";
            }
        }
        return nBase;
    }
}
