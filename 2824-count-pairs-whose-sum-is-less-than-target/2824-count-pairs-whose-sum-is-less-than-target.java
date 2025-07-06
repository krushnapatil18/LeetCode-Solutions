class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int low = 0;
        int high = n-1;
        int cnt = 0;
        Collections.sort(nums);

        while(low<=high){
            int left=nums.get(low);
            int right= nums.get(high);
            int sum = left + right;

            if (sum<target) {
                cnt += (high - low);
                low++;
            } else {
                high--;
            }
        }
        return cnt;


    }
}