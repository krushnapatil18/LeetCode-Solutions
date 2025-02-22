class Solution {
   public static int sumByD(int[] nums, int div) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + div - 1) / div;
        }
        return sum;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold) return -1;

        int max = Arrays.stream(nums).max().getAsInt();
        int low = 1, high = max;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}