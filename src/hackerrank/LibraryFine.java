package hackerrank;

public class LibraryFine {
  static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // 책반납을 동일년월안에 하루 늦을 경우 매일 15원씩 과금
    // 책반납을 동일년안에 한 달이 늦을 경우 매월 500원씩 과금
    // 책반납을 해당 년을 넘어버린 경우 10000원 과금
    //sol1
    /*
    if(y1 >= y2 && m1 == m2 && d1 > d2){
      return (d1-d2)*15;
    }else if(y1 == y2 && m1 > m2){
      return (m1-m2)*500;
    }else if(y1 >= y2){
      return (y1-y2)*10000;
    }
    return 0;
 */
    //sol2
    if (y1 > y2) { return 10000; }
    if (m1 > m2 && y1 == y2) { return 500 * (m1 - m2); }
    if (d1 > d2 && m1 == m2 && y1 == y2) { return 15 * (d1 - d2); }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(libraryFine(9,6,2015,6,6,2015)+", ans: 45");
    System.out.println(libraryFine(9,6,2015,6,6,2016)+", ans: 0");
    System.out.println(libraryFine(2,5,2015,30,5,2015)+", ans: 0");
    System.out.println(libraryFine(2,7,1014,1,1,1015)+", ans: 0");
    System.out.println(libraryFine(2,6,2014,5,7,2014)+", ans: 0");
    System.out.println(libraryFine(2,7,1014,1,1,1014)+", ans: 3000");
    System.out.println(libraryFine(2,7,2015,1,2,2014)+", ans: 10000");
    System.out.println(libraryFine(1,1,2001,1,2,2000)+", ans: 10000");
    System.out.println(libraryFine(31,8,2004,20,1,2004)+", ans: 3500");
    System.out.println(libraryFine(31,5,2014,1,5,2014)+", ans: 450");
  }
}
