package leetcodeEasyLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _0066PlusOne {

    public static int[] plusOne(int[] digits) {

        //마지막 자리수부터 시작해서 9가 있는 경우 자리수가 +1 증가하고 해당 숫자는 0이 된다
        //9가 없는 경우 마지막자리수만 +1증가시킨 뒤 break 로 종료
        int cnt = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                cnt++;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }

        //자리수가 1증가한 경우 증가한 첫번째 자리는 무조건 1이다.
        if (cnt == digits.length && digits[0] == 0) { //2
            int[] tmp = new int[digits.length + 1]; //3
            tmp[0] = 1;

            for (int i = 0; i < digits.length; i++) {
                tmp[i + 1] = digits[i];
            }
            return tmp;
        }
        return digits;
    }

    public static void main(String[] args) {
        //int[] digits = {1,2,3};
        //int[] digits = {4,3,2,1};
        //int[] digits = {0};
        //int[] digits = {9};
        int[] digits = {9,9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
