class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        Arrays.sort(nums);
        int cnt = 1;
        int result = 1;

        for(int i=1; i<n; i++){
           if(nums[i] == nums[i-1]) continue;

           if(nums[i] == nums[i-1]+1){
            cnt++;
           }else{
            result = Math.max(result, cnt);
            cnt =1;
           }
        }
        return Math.max(result, cnt);
    }
}