class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int mXgap = 0;
        if(nums.length<2){
            return 0;
        }
        else{

            for(int i=1; i<nums.length;i++){
                mXgap = Math.max(mXgap, nums[i] - nums[i - 1]);
            }
            return mXgap;
        }

    }
}