package hackerrank;

public class IntrotoTutorialChallenges {
  static int introTutorial(int V, int[] arr) {
    int i = 0;
    for(i=0; i<arr.length;i++){
      if(arr[i] == V){
        break;
      }
    }
    return i;
  }
  public static void main(String[] args) {
    System.out.println(introTutorial(3, new int[]{1,2,3})+", ans: 2");
    System.out.println(introTutorial(4, new int[]{1, 4, 5, 7, 9, 12})+", ans: 1");
  }
}
