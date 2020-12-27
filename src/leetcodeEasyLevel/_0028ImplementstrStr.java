package leetcodeEasyLevel;

public class _0028ImplementstrStr {
    public static int strStr(String haystack, String needle) {

        //풀이1 => 런타임 0ms 메모리 37.5MB
        if (haystack.equals("") && needle.equals(""))
            return 0;

        return haystack.indexOf(needle);

        //풀이2 : 삼항연산자 사용 => 런타임 0ms 메모리 37.8MB
//		return needle != null && !needle.trim().isEmpty() ? haystack.indexOf(needle) : 0;

    }

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "bba";

        //haystack = "";
        //needle = "a";

        System.out.println(strStr(haystack, needle));
    }
}
