package leetcodeEasyLevel;

public class _0122BestTimetoBuyandSellStockII {
  public static int maxProfit(int[] prices) {
    //엣지케이스를 정확하게 처리하기.
    if(prices == null || prices.length <= 1) return 0;
    
    //누적합시키기
    int sum = 0;
    for(int i=1; i<prices.length; i++){
      if(prices[i] > prices[i-1]){
        sum += prices[i]-prices[i-1];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] prices = //{7,1,5,3,6,4}; //=>7
                  {1,2,3,4,5}; //=> 4
                  //{7,6,4,3,1}; //=> 0
    System.out.println(maxProfit(prices));
  }
}
