import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums;

    while(true){
      nums = sc.nextInt();
      if(nums == 0) break; 
      System.out.println(nums);
    }
  }
}
