class Solution {
    public int singleNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;

    //     for(int i=0;i<n-1;i = i+3){

    //         if(i + 1 >= n || nums[i]!=nums[i-1]){
    //             return nums[i-1];
    //         }
    //     }
    //     return nums[n-1];
    // }

    int ones = 0;
    int twos =0;
    for(int num : nums){

        ones = (ones^num) & ~twos;
        twos = (twos^num) & ~ones;
    }
    return ones;
    }
}
