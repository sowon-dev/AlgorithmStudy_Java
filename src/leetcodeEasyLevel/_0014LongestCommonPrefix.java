package leetcodeEasyLevel;

public class _0014LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        String prefix="";
        if(strs.length == 0) return prefix;
        prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            String cur = strs[i];
            while(cur.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs =
                //{"flower", "flow", "flight"};
               {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
    }
}
