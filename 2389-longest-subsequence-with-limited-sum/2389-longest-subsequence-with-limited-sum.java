//1sort
//2prfix
//3bs

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;;
        int m = queries.length;
        Arrays.sort(nums); //1

        int prefix[] = new int[n];//2
        prefix[0] = nums[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        int ans[] = new int[m];

        for(int i =0; i<m;i++){

            int low = 0;
            int high = n-1;
            int res = 0;
            while(low<=high){
                int mid = low + (high-low)/2;

                if(prefix[mid]<=queries[i]){

                    res = mid+1;
                    low = mid+1;
                    
                }
                else{
                    
                    high = mid-1;
                }

            ans[i] = res;
            }
        }


    return ans;
    }
}