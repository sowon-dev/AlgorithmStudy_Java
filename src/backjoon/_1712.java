package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1712
// 손익분기점
public class _1712 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 잘못된 접근방식으로 엣지케이스에 걸려 실패
    /*
    String[] money = br.readLine().split(" ");
    int fixed = Integer.parseInt(money[0]);
    int variable = Integer.parseInt(money[1]);
    int calvariable = variable;
    int price = Integer.parseInt(money[2]);
    int calPrice = price;
    int sales = 1;

    while(calPrice <= fixed+calvariable){
      sales++;
      calPrice = price * sales;
      calvariable = variable * sales;
      if(calvariable < 0 ){
        sales = -1;
        break;
      }
    }
    System.out.println(sales);
     */
    // memory 11496 runtime 76
    // 한 줄에 space로 구분되어 있을땐 StringTokenizer를 사용한다.
    StringTokenizer st = new StringTokenizer(br.readLine());
    // 총 수입과 총 지출이 같을 때의 식으로 나타내면 (price * sales) = fixed+(variable * sales)
    // 판매량만 좌변에 남도록 식을 정리하면  sales =  fixed / (price-variable)
    // 손익분기점은 fixed / (price-variable) + 1 이 되어야한다.
    // 여기서 모든 수는 자연수이기에 [ {fixed / (price-variable)} + 1 ] > 0 이어야한다.
    // 따라서 분모인 (price-variable) 가 0보다 커야 이익이 생기고 0보다 작거나 같으면 이익이 생기지 않는다.
    // 이걸 식으로 정리하면 price > variable 일때 이익이 생기고 price <= variable일때는 이익이 발생하지 않는다.

    int fixed = Integer.parseInt(st.nextToken());
    int variable = Integer.parseInt(st.nextToken());
    int price = Integer.parseInt(st.nextToken());

    if (price <= variable) {
      System.out.println("-1");
    }
    else {
      System.out.println((fixed/(price-variable))+1);
    }
  }
}
/*
input
1000 70 170

output
11
 */