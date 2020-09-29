## 문제 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기
문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력해보자.


## 코드

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    char x;
    Scanner sc = new Scanner(System.in);
    x = sc.next().charAt(0);
    sc.close(); //효율을 위해 꼭 자원해제
    System.out.print(x);
  }
}
```


## 배운 지식

> Scanner class in Java supports nextInt(), nextLong(), nextDouble() etc. But there is no nextChar()
> - To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream. We may pass an object of class File if we want to read input from a file.
> - To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). For example, to read a value of type short, we can use nextShort()
> - To read strings, we use nextLine().
> - To read a single character, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) function returns the first character in that string.
> 출처 : https://www.geeksforgeeks.org/scanner-class-in-java/