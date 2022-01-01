//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyPrice=0;
        
        for(int i=1;i<prices.length;i++){
        while(i<prices.length){
            if(prices[i]>prices[i-1]){
                buyPrice=prices[i-1];
                break;
            }
            i++;
        }
        while(i<prices.length){
            if(prices[i]<prices[i-1]  ){
                profit=profit+prices[i-1]-buyPrice;
                break;
            }
            if(i==prices.length-1){
                profit=profit+prices[i]-buyPrice;
            }
            i++;
        }
        
        }
        return profit;
    }
}
/*
class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit = 0; // 维护最大利润
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;  
    }
}
*/
