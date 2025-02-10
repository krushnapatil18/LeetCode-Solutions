class Solution {
    public void Reverse( int [] nums, int start, int end){
       

        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        
        Reverse(nums, 0, n - k - 1);
        Reverse(nums, n - k, n - 1);
        Reverse(nums, 0, n - 1);
        
    }
}