class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int buy_price = prices[0];
        for(int i=1;i<n;i++){
            int curr = prices[i]-buy_price;
            if(curr>max){
                max=curr;
            }
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
        }
        return max;
        
    }
}