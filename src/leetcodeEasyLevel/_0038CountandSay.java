package leetcodeEasyLevel;

public class _0038CountandSay {
    public static String countAndSay(int n){

        if(n == 1) return "1";

        //countAndSay(4)이면 countAndSay(3)을 String에 저장 후 Char[]로 만들기
        String s = countAndSay(n-1); //21
        char[] sc = s.toCharArray(); //[2, 1]

        StringBuffer result = new StringBuffer();
        int count = 0;
        for(int i=0; i<=sc.length; i++){ //0 1 2 길이는 2
            
            //배열의 [i]와 [i-1]가 다를때까지 count는 0으로 초기화
            if(i == sc.length || i-1 >= 0 && sc[i] != sc[i-1]){
                result.append(count); 
                result.append(sc[i-1]); // i번째말고 i 뒤쪽에 있는 char를 추가
                count = 0; 
            }
            
            //배열의 [i]와 [i-1]가 같으면 count++
            count++; //1
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int n;
        //n = 1;
        n = 4;
        System.out.println(countAndSay(n)+" "+countAndSay(n).getClass().getName());
    }

}
