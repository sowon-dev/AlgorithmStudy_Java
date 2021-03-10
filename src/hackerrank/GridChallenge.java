package hackerrank;

import java.util.Arrays;

public class GridChallenge {
  static String gridChallenge(String[] grid) {
    char ll[] = new char[grid.length];
    char b[] = new char[grid.length];
    boolean xx=true;
    int i=0;
    while(xx && i<grid[0].length()){
      for(int j=0 ; j<grid.length;j++ ){
        ll[j]=grid[j].charAt(i);
      }

      b= Arrays.copyOf(ll,grid.length);
      Arrays.sort(ll);

      if(!(Arrays.equals(b,ll))){
        xx=false;
        break;
      }
      i++;
    }

    if(xx){
      return "YES";
    }
    else{
      return "NO";
    }
  }

  public static void main(String[] args) {
    System.out.println(gridChallenge(new String[]{"abc", "ade", "efg"})+", ans:YES");
    System.out.println(gridChallenge(new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"})+", ans:YES");
  }
}
