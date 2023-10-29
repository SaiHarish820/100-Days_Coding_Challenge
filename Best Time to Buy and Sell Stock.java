// TC : O(n) & SC : (1)
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int pans = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            pans = prices[i] - min;

            if(ans < pans) ans = pans;
        }
       return ans;
    }
}