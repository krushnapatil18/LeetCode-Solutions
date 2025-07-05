class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1, fng = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= 0) {
                fng = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        low = 0; high = n - 1;
        int fp = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                fp = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return Math.max(fng, n - fp);
    }
}
