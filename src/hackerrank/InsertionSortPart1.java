package hackerrank;

public class InsertionSortPart1 {
  static void insertionSort1(int n, int[] arr) {
    int sort = arr[arr.length - 1];

    //i를 for문밖에서도 사용해야하기때문에 전역변수로 선언
    int i;
    //arr의 끝에서 두번째 요소부터 변수 sort보다 큰 경우 숫자를 복제한다.
    for (i = arr.length - 2; (i >= 0) && (arr[i] > sort); i--) {
      arr[i + 1] = arr[i];
      for(int num : arr){
        System.out.print(num+" ");
      }
      System.out.println("");
    }
    //변수sort보다 arr 요소가 작은 경우 변수 sort를 그 요소 다음 자리에 넣는다.
    arr[i + 1] = sort;
    for(int num : arr){
      System.out.print(num+" ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    insertionSort1(5, new int[]{1,2,4,5,3});
    System.out.print(", ans: 1 2 4 5 5\n"
            + "1 2 4 4 5\n"
            + "1 2 3 4 5");
  }
}
