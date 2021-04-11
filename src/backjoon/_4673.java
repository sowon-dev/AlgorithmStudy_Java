package backjoon;
// https://www.acmicpc.net/problem/4673
// 셀프 넘버
public class _4673 {
  //sol memory 12228 runtime 132
  static int d(int n){
    int sum = n;

    while(n != 0){
      // 첫 째 자리수
      sum += n % 10;
      // 10을 나누어 첫 째 자리를 없앤다
      n /= 10;
    }

    return sum;
  }

  public static void main(String[] args) {
    boolean[] isNotSelfNumber = new boolean[10001];	// 1부터 10000이므로

    for (int i = 1; i < 10001; i++){
      int n = d(i);

      if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
        isNotSelfNumber[n] = true;
      }
    }

    for (int i = 1; i < isNotSelfNumber.length; ++i) {
      if (!isNotSelfNumber[i]) {
        System.out.println(i);
      }
    }
  }
}
