class Solution {
    public int[] singleNumber(int[] nums) {
        
        long xor = 0;
        int n = nums.length;

        for(int i=0;i<n;i++ ){
            xor = xor ^ nums[i];
        }

        long rightMost = xor & (-xor);
        int b1=0;
        int b2=0;
        for(int i=0;i<n;i++){

               if((nums[i]&rightMost) !=0){
                b1 = b1^nums[i];
               } 
               else{
                b2 = b2^nums[i];
               }
        }
        return new int[]{b1, b2};
    }
}