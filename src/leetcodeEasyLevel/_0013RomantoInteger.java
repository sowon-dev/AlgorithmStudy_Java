package leetcodeEasyLevel;

public class _0013RomantoInteger {
    static int romanToInt(String s) {
        int result = 0;
        String[] chars = s.split("");

        for(int i= chars.length-1; i>=0; i--) { //1 = 2-1
            boolean isException = false;
            //System.out.printf("i= %d, chars.length-1= %d, chars[i]= %s, %b,", i, chars.length-1, chars[i], isException);

            if (i != chars.length - 1){
                switch (chars[i]){
                    case "I":
                        if (chars[i + 1].equals("V") || chars[i+1].equals("X")){
                            isException = true;
                            result -= 1;
                        }
                        break;
                    case "X":
                        if (chars[i + 1].equals("L") || chars[i+1].equals("C")){
                            isException = true;
                            result -= 10;
                        }
                        break;
                    case "C":
                        if (chars[i + 1].equals("D") || chars[i+1].equals("M")){
                            isException = true;
                            result -= 100;
                        }
                        break;
                }
            }

            if(!isException){
                //System.out.printf(" 일반switch문");
                switch (chars[i]){
                    case "I":
                        result += 1;
                        break;
                    case "V":
                        result += 5;
                        break;
                    case "X":
                        result += 10;
                        break;
                    case "L":
                        result += 50;
                        break;
                    case "C":
                        result += 100;
                        break;
                    case "D":
                        result += 500;
                        break;
                    case "M":
                        result += 1000;
                        break;
                }
            }
            //System.out.printf(", result= %d \n",result);
        }//end of for
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(romanToInt("III")+" 답은 3");
        System.out.println(romanToInt("IV")+" 답은 4");
        //System.out.println(romanToInt("IX")+" 답은 9");
        //System.out.println(romanToInt("LVIII")+" 답은 58");
        //System.out.println(romanToInt("XIV")+" 답은 14");
        //System.out.println(romanToInt("XV")+" 답은 15");
        //System.out.println(romanToInt("MCMXCIV")+" 답은 1994");
    }
}
