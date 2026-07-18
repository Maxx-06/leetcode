class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profite = 0;
        for(int i=0; i<prices.length; i++){
            if (prices[i] < min_price){
                min_price = prices[i];
            }
            int curr = prices[i] - min_price;
            if (curr > max_profite) {
                max_profite = curr;
            }
        }
        return max_profite;
    }
}