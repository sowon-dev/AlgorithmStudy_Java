package leetcodeEasyLevel;

public class _0121BestTimetoBuyandSellStock {

  public static int maxProfit(int[] prices) {
    //ArrayIndexOutOfBoundsException
    if (prices.length == 0) return 0;

    int min = prices[0];
    int max = prices[0];
    int profit = 0;

    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      if (min == prices[i]) {
        max = min; //Selling price needs to be larger than buying price.
      } else {
        max = Math.max(max, prices[i]);
        profit = Math.max(profit, max - min);
      }
    }
    System.out.printf("min: %d, max: %d \n", min, max);
    return profit;
  }

  public static void main(String[] args) {
    int[] prices =
        {7,1,5,3,6,4};
        //{7, 6, 4, 3, 1};
    System.out.println("return: " + maxProfit(prices));
  }
}
