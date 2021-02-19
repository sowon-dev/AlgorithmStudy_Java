package hackerrank;

public class DrawingBook {
  static int pageCount(int n, int p) {
    //n쪽불량의 책에서 p쪽을 몇 번의 책장을 넘겨야 가장 빠르게 찾을 수 있을까.
    int totalpageFromFront = n/2;
    int targetpageFromFront = p/2;
    int targetpageFromBack = totalpageFromFront - targetpageFromFront;
    System.out.println(totalpageFromFront + ", "+ targetpageFromFront +", " + targetpageFromBack);
    return Math.min(targetpageFromFront, targetpageFromBack);
  }
  public static void main(String[] args) {
    System.out.println(pageCount(5, 1)+", ans: 0"); //앞
    System.out.println(pageCount(5, 2)+", ans: 1"); //앞
    System.out.println(pageCount(5, 3)+", ans: 1"); //앞뒤 동일
    System.out.println(pageCount(5, 4)+", ans: 0"); //뒤
    System.out.println(pageCount(5, 5)+", ans: 0"); //뒤
    System.out.println();
    System.out.println(pageCount(6, 1)+", ans: 0"); //앞부터
    System.out.println(pageCount(6, 2)+", ans: 1"); //앞부터
    System.out.println(pageCount(6, 3)+", ans: 1"); //앞
    System.out.println(pageCount(6, 4)+", ans: 1"); //뒤
    System.out.println(pageCount(6, 5)+", ans: 1"); //뒤
    System.out.println(pageCount(6, 6)+", ans: 0"); //뒤
		/*
		System.out.println(pageCount(7, 1)+", ans: 0"); //앞부터
		System.out.println(pageCount(7, 2)+", ans: 1"); //앞부터
		System.out.println(pageCount(7, 3)+", ans: 1"); //앞부터
		System.out.println(pageCount(7, 4)+", ans: 1"); //뒤뷰터
		System.out.println(pageCount(7, 5)+", ans: 1");
		System.out.println(pageCount(7, 6)+", ans: 0");
		System.out.println(pageCount(7, 7)+", ans: 0");

		System.out.println(pageCount(8, 1)+", ans: 0"); //앞부터
		System.out.println(pageCount(8, 2)+", ans: 1"); //앞부터
		System.out.println(pageCount(8, 3)+", ans: 1"); //앞부터
		System.out.println(pageCount(8, 4)+", ans: 2");
		System.out.println(pageCount(8, 5)+", ans: 2");
		System.out.println(pageCount(8, 6)+", ans: 1");
		System.out.println(pageCount(8, 7)+", ans: 1");
		System.out.println(pageCount(8, 8)+", ans: 0");
		*/
  }
}
