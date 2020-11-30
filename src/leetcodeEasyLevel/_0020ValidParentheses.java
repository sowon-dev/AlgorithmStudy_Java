package leetcodeEasyLevel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _0020ValidParentheses {
    public static void main(String[] args) {
        String s;
        //test cases
        s = "()[]{}";
        //s = "({[()]})";
        //s = "(){}}{";

        boolean isValid;
        
        //내코드 => 실패
        /*
            String[] arr = s.split("");
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals(("(")) || arr[i].equals(("{")) || arr[i].equals(("["))) {
                    for (int j = arr.length - i - 1; j > i; j--) {
                        if (arr[i].equals("(") && arr[j].equals(")")
                                || arr[i].equals("{") && arr[j].equals("}")
                                || arr[i].equals("[") && arr[j].equals("]")) {
                            isValid = true;
                        }
                        System.out.printf("arr[%s]: %s, arr[%s]: %s  => ", i, arr[i], j, arr[j]);
                        System.out.println(isValid);
                    }
                }
            }
        */
        //해쉬맵을 이용한 풀이 https://all-dev-kang.tistory.com/entry/LeetCode-%EC%9E%90%EB%B0%94-20-Valid-Parentheses
        Map<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> st = new Stack<>();
        isValid = st.isEmpty();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                st.push(map.get(c));
            } else if (map.containsValue(c)) {
                if (st.isEmpty() || st.pop() != c) {
                    isValid = false;
                }
            }
        }

        //return isValid;
        System.out.println("결과: "+ isValid);
    }
}
