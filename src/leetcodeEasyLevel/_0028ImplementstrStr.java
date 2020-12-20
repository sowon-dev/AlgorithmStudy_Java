package leetcodeEasyLevel;

public class _0028ImplementstrStr {
    public static int strStr(String haystack, String needle) {

        if(haystack.equals("") && needle.equals(""))
            return 0;

        return haystack.indexOf(needle);

    }

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "bba";

        //haystack = "";
        //needle = "a";

        System.out.println(strStr(haystack, needle));
    }
}
