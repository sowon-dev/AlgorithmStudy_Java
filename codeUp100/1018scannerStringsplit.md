## 문제 : [기초-입출력] 시간 입력받아 그대로 출력하기
시(hour)와 분(minute)이 ":" 으로 구분된 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.

```java
//입력예시
3:16

//출력예시
3:16
```

## 코드1 : nextLine()이용

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	String time = scan.nextLine();
	scan.close();
	System.out.printf("%s", time);
  }
}
```


## 코드2 : Integer.parseInt()이용

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    sc.close();

    String[] time = str.split(":");
    System.out.printf("%d:%d", Integer.parseInt(time[0]), Integer.parseInt(time[1]));
  }
}
```


## 코드3 : Integer.valueOf()이용

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] time = str.split(":");
    sc.close();

    System.out.printf("%d:%d", Integer.valueOf(time[0]),Integer.valueOf(time[1]));
  }
}
```


## 비교
Scanner를 close 유무로 수행시간과 메모리 차이가 발생한다.

| | nextLine() | Integer.parseInt() | Integer.valueOf() |
| :---: | :---: | :---: | :---: |
| close 전 수행시간 | 109ms | 110ms | 109ms |
| close 후 수행시간 | 109ms | 114ms | 113ms|
| close 전 메모리 | 14960kb| 15028kb | 15004kb |
| close 후 메모리 | 14972kb| 14976kb | 14972kb |


## next()와 nextLine()차이
1. next() : 공백을 기준으로 입력.
1. nextLine() : 한 라인을 기준으로 입력.
  - 따라서 split()하기 좋음.


```java
//입력값 가나다 라 마 바 사 일때

//next() 사용
String n = sc.next(); 
System.out.println(n);

//nextLine() 사용 
String nl = sc.nextLine(); 
System.out.println(nl);

//출력값
가나다 
가나다 라 마 바 사
```

![출처: https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/](/img/nextNnextLine.PNG)


## parseInt, valueOf의 차이

> parseInt : 리턴타입 기본 자료형
> valueOf : 리턴타입 객체
> valueOf는 결국 parseInt를 호출하는 형태이다. 문자열을 변환할 때 객체로 받아서 사용하느냐, 기본 자료형으로 받아서 사용하느냐의 차이다.
> 출처 : https://brunch.co.kr/@artiveloper/11