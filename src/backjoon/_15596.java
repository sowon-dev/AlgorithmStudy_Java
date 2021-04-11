package backjoon;

// https://www.acmicpc.net/problem/15596
// 정수 N개의 합
public class _15596 {
  static long sum(int[] a){
    long ans = 0;

    // sol1 for each문 사용: memory 423360 runtime 20
    for(int i : a){
      ans += i;
    }

    //sol2 for문 사용: memory 422688 runtime 32
/*    for(int i=0; i<a.length; i++){
      ans += a[i];
    }*/
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[]{1,2,3}));
  }
}
