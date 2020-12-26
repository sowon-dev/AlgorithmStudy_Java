package leetcodeEasyLevel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _0066PlusOne {

    public static int[] plusOne(int[] digits) {

        digits[digits.length-1] = digits[digits.length-1]+1;
        try {
            String[] temp = Arrays.toString(digits).split("");
            int[] result= new int[temp.length];

            for(int i=0; i<temp.length; i++){
                result[i] = Integer.parseInt(temp[i]);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch ()

        return result;
    }

    public static void main(String[] args) {
        //int[] digits = {1,2,3};
        //int[] digits = {4,3,2,1};
        //int[] digits = {0};
        int[] digits = {9};

        System.out.println(plusOne(digits));
    }
}
