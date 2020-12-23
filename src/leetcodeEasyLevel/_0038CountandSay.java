package leetcodeEasyLevel;

public class _0038CountandSay {
    public static String countAndSay(int n){
        String result = "";

        for(int i=1; i<=n; i++){
            result += String.valueOf(i);
            System.out.printf("i는 %d, result는 %s \n", i, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 1;
        n = 4;
        System.out.println(countAndSay(n)+" "+countAndSay(n).getClass().getName());
    }

}
