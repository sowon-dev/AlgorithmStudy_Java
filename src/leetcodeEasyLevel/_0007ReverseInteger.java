package leetcodeEasyLevel;

public class _0007ReverseInteger {
    static int reverse(int x) {
        /* 내코드 but int x = 9646324351; 이 케이스를 통과하지못함
        //convert int to String
        String[] org = String.valueOf(x).split(""); //- 1 2 3
        String[] temp = new String[org.length]; //4

        if(org[0].equals("-")){
            temp[0] = "-";
            for(int i=1; i<temp.length; i++){
                temp[i] = org[org.length-i];
            }
        }else{
            for(int i=0; i<temp.length; i++){
                temp[i] = org[org.length-1-i];
                //System.out.printf("temp[%s]: %s, org[%s]: %s \n", i, temp[i],(org.length-1-i),org[org.length-1-i]);
            }
        }

        //conver String to int
        return Integer.parseInt(String.join("",temp));
        }
        */

        /*solution: https://www.youtube.com/watch?v=XpvNcex-rc0&feature=youtu.be */

        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    //test cases
    public static void main(String[] args) {
        //int x = 123;
        //int x = -123;
        int x = 120;
        //int x = 0;
        //int x = 9646324351; //이 케이스를 통과하지못함

        System.out.println(reverse(x));
    }
}
