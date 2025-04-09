class Solution {
    public int buyChoco(int[] prices, int money) {
        int lowest = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int cost = prices[i] + prices[j];
                if(cost < lowest){
                    lowest = cost;
                }
            }
        }
        if(lowest <= money){
            return money - lowest;
        }
        return money;
    }
}
