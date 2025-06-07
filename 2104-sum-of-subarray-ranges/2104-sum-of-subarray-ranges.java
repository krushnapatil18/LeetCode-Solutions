class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sum = 0;

        for(int i = 0; i<n-1;i++){
            int largest = nums[i];
            int smallest = nums[i];

            for (int j = i + 1; j < n; j++) {

                largest = Math.max(largest, nums[j]);
                smallest = Math.min(smallest, nums[j]);
                sum += (long)(largest - smallest);
            }
        }
        return sum;
    }
}