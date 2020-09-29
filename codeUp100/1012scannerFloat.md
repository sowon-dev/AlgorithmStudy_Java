## 문제 : [기초-입출력] 실수 1개 입력받아 그대로 출력하기
실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
저장되어 있는 실수값을 출력해보자.


## 내코드

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float x;
    Scanner sc = new Scanner(System.in);
    x = sc.nextFloat();
    System.out.print(x);
  }
}

//입력값 1.414213일때 출력값
1.414213
```

출력값확인하고 코드소슽 틀렸는데 테스트값이 일치하지않았다. 통과못한 테스트값을 보니 아래 테스트를 통과하지 못했다.
아래와 같은 출력값이 나와야하는데 내 코드 결과는 `1.56`이었다.

```java
//입력값 1.560000일때 출력값
1.560000
```


## 재시도하여 성공한 코드

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float x;
    Scanner sc = new Scanner(System.in);
    x = sc.nextFloat();
    sc.close(); //효율을 위해 꼭 자원해제
    System.out.printf("%f\n", x);
  }
}

//입력값 1.414213일때 출력값
1.414213

//입력값 1.560일때 출력값
1.560000
```


## 배운 지식
정수나 문자는 전혀 상관없지만 소수점이하 자릿수가 있는 경우에는 소수점이하 자릿수까지 표현가능하다.
아래 코드처럼 다양한 소수점을 표현할 수 있다.
이때 잘린 소수점이 있다면 **반올림**된다.

```java
System.out.println(x);
System.out.printf("%.1f\n", x);
System.out.printf("%.3f\n", x);
System.out.printf("%f\n", x);

//입력값 1.560일때 출력값
1.56
1.6
1.560
1.560000
```