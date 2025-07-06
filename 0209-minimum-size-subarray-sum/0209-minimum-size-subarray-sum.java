class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int n = nums.length;
        int sum = 0;

        for(int r=0;r<n;r++){
            
            sum+=nums[r];

            while(sum>=target){

                mini = Math.min(mini, r-left + 1);
                sum-= nums[left++];
            }
        }
        if(mini == Integer.MAX_VALUE){
            return 0;
        }else{
            return mini;
        }
    }
}