public class c1024 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    /*
    //split()사용
    String[] ss = s.split("");

    for(int i=0; i<ss.length; i++){
    System.out.println("'"+ss[i]+"'");
    }*/

    //StringTokenizer 사용 (한 개의 구분자만을 사용가능)
    StringTokenizer st = new StringTokenizer(s,".");

    while (st.hasMoreElements()) {
    System.out.println(st.nextToken());
  }

}
