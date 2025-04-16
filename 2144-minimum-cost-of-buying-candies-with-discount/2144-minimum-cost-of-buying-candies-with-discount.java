class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int t=0;

        for(int i=n-1; i>=0; i--){
            
            t += cost[i];
            i--;

            if(i>=0){
                t+=cost[i];
            }
            i--;

        }
        return t;
    }
}