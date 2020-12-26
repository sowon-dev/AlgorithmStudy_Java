package leetcodeEasyLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _0066PlusOne {

    public static int[] plusOne(int[] digits) {

        digits[digits.length - 1] = digits[digits.length - 1] + 1;

        String tempS = Arrays.toString(digits);
        String[] temp;

        //System.out.println("temp: "+Arrays.toString(temp)+", temp.length: "+temp.length);

        if(tempS.indexOf(",") == -1){ //한 자리수일때
            temp = tempS.split("");
            int[] result = new int[temp.length-2];
            for (int i = 0; i < result.length; i++) {
                result[i] = Integer.parseInt(temp[i+1]);
            }
            return result;
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
