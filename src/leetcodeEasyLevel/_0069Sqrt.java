package leetcodeEasyLevel;

public class _0069Sqrt {

  public static int mySqrt(int x) {
    // https://www.youtube.com/watch?v=Jzcag2SOgYk
    // 런타임 1ms 메모리 36 MB
    long start = 1;
    long end = x;
    int ans = 0;

    if (x == 0) {
      return x;
    }
    //x의 중간값인 middle point(이하 mid)
    // mid 제곱시
    // 1. x와 같으면 mid 그대로 출력
    // 2. x보다 크면 end값을 mid 보다 1작게 설정
    // 3. x보다 작거나 같으면 start값을 mid보다 1 크게 설정하고 ans에 mid값 대입
    while (start <= end) {
      long mid = start + (end - start) / 2;

      if (mid * mid == x) {
        return (int) mid;
      }
      if (mid * mid > x) {
        end = mid - 1;
      }
      if (mid * mid <= x) {
        start = mid + 1;
        ans = (int) mid;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int x = 4;
    //int x = 8;
    System.out.println(mySqrt(x));
  }
}
